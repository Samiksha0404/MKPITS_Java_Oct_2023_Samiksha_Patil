package com.mkpits.bank.service.impl;

import com.mkpits.bank.dto.UserRequestDto;
import com.mkpits.bank.dto.response.AccountResponseDto;
import com.mkpits.bank.model.*;
import com.mkpits.bank.repository.*;
import com.mkpits.bank.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService implements IAccountService {
    @Autowired
    AccountRepository accountRepository;

    @Autowired
    StateRepository stateRepository;

    @Autowired
    CityRepository cityRepository;

    @Autowired
    DistrictRepository districtRepository;

    @Autowired
    UserRepo userRepository;

    @Override
    public List<AccountResponseDto> getAllUserAccounts(Integer userId) {
        List<Account> accountList = accountRepository.findAccountsByUserId(userId);
        List<AccountResponseDto> accountResponceDtoList = new ArrayList<>();
        for (Account account : accountList){
            AccountResponseDto accountResponceDto = convertUserModelToUserDto(account);
            accountResponceDtoList.add(accountResponceDto);
        }


        return accountResponceDtoList;
    }



    private AccountResponseDto convertUserModelToUserDto(Account account) {
        AccountResponseDto responceDto= AccountResponseDto.builder()
                .accType(account.getAccType())
                .accNo(account.getAccNo())
                .balance(account.getBalance())
                .openingDate(account.getOpeningDate())
                .build();
        return responceDto;
    }

    @Override
    public AccountResponseDto deleteAccount(String accNo) {
        String account = String.valueOf(accountRepository.findIdByAccountNumber(accNo));

        accountRepository.deleteById(Integer.valueOf(account));
        System.out.println("User data with id: " + account + " deleted successfully");

        return null;
    }

    @Override
    public Integer getUserIdByAccountNo(String accNo) {
        Integer userId = accountRepository.findUserIdByAccountNumber(accNo);
        return userId;
    }

    @Override
    public UserRequestDto addAccount(UserRequestDto userRequestDto) {
        // Fetch the user entity from the database using userId
        User user = userRepository.findById(userRequestDto.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        // Create a new account entity
        Account account = new Account();

        //generating account number here
        State state = stateRepository.findStateByName(userRequestDto.getState());
        District district =  districtRepository.findDistrictByName(userRequestDto.getDistrict());
        City city =  cityRepository.findCityByName(userRequestDto.getCity());

        //getting last account number for increasing new by one
        String lastAccountnumber = accountRepository.findLastAccountNumber();

        account.setAccNo(String.format("%02d",state.getId())+String.format("%04d",district.getId())+String.format("%04d",city.getId())+String.format("%04d",Integer.valueOf(lastAccountnumber.substring(lastAccountnumber.length()-4))+1));


        account.setBalance(userRequestDto.getBalance());
        account.setAccType(userRequestDto.getAccountType());
        account.setOpeningDate(LocalDate.now());
        account.setUserId(user.getId());


        // Save the account entity to the database
        Account savedAccount = accountRepository.save(account);


        return userRequestDto;
    }
}

