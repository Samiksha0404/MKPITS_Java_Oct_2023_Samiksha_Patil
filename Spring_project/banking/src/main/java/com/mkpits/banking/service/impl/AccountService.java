package com.mkpits.banking.service.impl;



import com.mkpits.banking.dto.request.AccountRequestDto;
import com.mkpits.banking.dto.request.MoneyTransactionRequestDto;
import com.mkpits.banking.dto.request.UserRequestDto;
import com.mkpits.banking.dto.response.AccountGetResponseDto;
import com.mkpits.banking.dto.response.AccountPostResponseDto;
import com.mkpits.banking.dto.response.AccountPutResponseDto;
import com.mkpits.banking.dto.response.UserGetResponseDto;
import com.mkpits.banking.entity.Account;
import com.mkpits.banking.entity.User;
import com.mkpits.banking.exception.AccountLimitExceededException;
import com.mkpits.banking.repository.AccountRepository;
import com.mkpits.banking.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class AccountService implements IAccountService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public List<AccountGetResponseDto> getAccountsByUserId(Integer userId) {
        List<Account> accountList = accountRepository.findAccountsByUserId(userId);
        List<AccountGetResponseDto> responseDtoList = new ArrayList<>();

        for (Account account : accountList) {
            AccountGetResponseDto dto = convertAccountToAccountGetResponseDto(account);
            responseDtoList.add(dto);
        }

        return responseDtoList;
    }

    @Override
    public AccountGetResponseDto getAccountByUserId(Integer userId) {
        Optional<Account> account = accountRepository.findByUserId(userId);
        AccountGetResponseDto accountGetResponseDto = new AccountGetResponseDto();
        if (account.isPresent()) {
            accountGetResponseDto = convertAccountToAccountGetResponseDto(account.get());
        }
        return accountGetResponseDto;

    }

    private AccountGetResponseDto convertAccountToAccountGetResponseDto(Account account) {
        AccountGetResponseDto accountGetResponseDto = new AccountGetResponseDto();
        accountGetResponseDto.setUserId(account.getUserId());
        accountGetResponseDto.setAccountType(account.getAccountType());
        accountGetResponseDto.setRateOfInterest(account.getRateOfInterest());
        accountGetResponseDto.setBalance(account.getBalance());
        return accountGetResponseDto;
    }

    @Override
    public AccountPutResponseDto updateAccount(UserRequestDto userRequestDto) {
        Optional<Account> account = accountRepository.findByUserId(userRequestDto.getUserId());
        AccountPutResponseDto accountPutResponseDto = new AccountPutResponseDto();
        if (account.isEmpty()) {
            System.out.println("id not found");
        } else {
            Account account1 = convertUserRequestDtoToAccount(userRequestDto, account.get());
            account1 = accountRepository.save(account1);
            return convertAccountToAccountPutResponseDto(account1);
        }

        return accountPutResponseDto;
    }

    @Override
    public void transaction(MoneyTransactionRequestDto transactionRequest) {
        Integer fromUserId = transactionRequest.getFromUserId();
        Integer toUserId = transactionRequest.getToUserId();
        BigDecimal amount = transactionRequest.getAmount();

        if (fromUserId.equals(toUserId)) {
            throw new RuntimeException("Sender cannot send money to themselves");
        }

        Account fromAccount = accountRepository.findByUserId(fromUserId)
                .orElseThrow(() -> new RuntimeException("Sender not found"));

        Account toAccount = accountRepository.findByUserId(toUserId)
                .orElseThrow(() -> new RuntimeException("Receiver not found"));

        BigDecimal fromBalance = new BigDecimal(fromAccount.getBalance());
        BigDecimal toBalance = new BigDecimal(toAccount.getBalance());

        if (fromBalance.compareTo(amount) < 0) {
            throw new RuntimeException("Insufficient balance");
        }

        fromAccount.setBalance(fromBalance.subtract(amount).toString());
        toAccount.setBalance(toBalance.add(amount).toString());

        accountRepository.save(fromAccount);
        accountRepository.save(toAccount);
    }

    @Override
    public AccountPostResponseDto createAccount(AccountRequestDto accountRequestDto) {

        User user = new User();

        // Fetch counts for each account type
        int currentCount = accountRepository.countByAccountType("current");
        int savingsCount = accountRepository.countByAccountType("savings");
        int fdCount = accountRepository.countByAccountType("fixed deposit");
        int rdCount = accountRepository.countByAccountType("recurring deposit");

        // Convert account type to lowercase for consistency
        String accountType = accountRequestDto.getAccountType().toLowerCase();

        // Check if the limits for each account type are exceeded
        if ((accountType.equals("current") && currentCount >= 1)
                || (accountType.equals("savings") && savingsCount >= 1)
                || (accountType.equals("recurring deposit") && rdCount >= 5)
                || (accountType.equals("fixed deposit") && fdCount >= 5)) {
            throw new AccountLimitExceededException("You have reached the limit to open: " + accountType + " account.");
        }

        // Convert DTO to entity and save
        Account account = convertUserRequestDtoToAccounts(accountRequestDto, user);
        account = accountRepository.save(account);

        // Convert entity to response DTO and return
        return convertAccountsToAccountPostResponseDto(new AccountPostResponseDto(), account);
    }

    private AccountPostResponseDto convertAccountsToAccountPostResponseDto(AccountPostResponseDto accountPostResponseDto, Account account) {
        return AccountPostResponseDto.builder()
                .userId(account.getUserId())
                .accountType(account.getAccountType())
                .rateOfInterest(account.getRateOfInterest())
                .balance(account.getBalance())
                .build();
    }

    private Account convertUserRequestDtoToAccounts(AccountRequestDto accountRequestDto, User user) {
        return Account.builder()
                .userId(accountRequestDto.getUserId())
                .accountType(accountRequestDto.getAccountType())
                .balance(accountRequestDto.getBalance())
                .rateOfInterest("0")
                .createdAt(LocalDateTime.now())
                .createdBy(1)
                .build();
    }


    private AccountPutResponseDto convertAccountToAccountPutResponseDto(Account account1) {
        return AccountPutResponseDto.builder()
                .rateOfInterest(account1.getRateOfInterest())
                .build();

    }

    private Account convertUserRequestDtoToAccount(UserRequestDto userRequestDto, Account account) {

        if (userRequestDto.getRateOfInterest() != null) {
            account.setRateOfInterest(userRequestDto.getRateOfInterest());
        }
        return account;
    }
}

