package com.mkpits.bank.service.impl;

import com.mkpits.bank.dto.UserRequestDto;
import com.mkpits.bank.dto.response.UserResponseDto;
import com.mkpits.bank.model.*;
import com.mkpits.bank.repository.*;
import com.mkpits.bank.service.IUserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    UserRepo userRepo;
    @Autowired
    AccountRepository accountRepository;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    UserCredentialRepository userCredentialRepository;

    @Autowired
    StateRepository stateRepository;

    @Autowired
    CityRepository cityRepository;

    @Autowired
    DistrictRepository districtRepository;

    @Autowired
     BranchRepository branchRepository;


    public List<UserResponseDto> getAllUsers() {
        List<User> usersList = (List<User>) userRepo.findAll();
        List<UserResponseDto> userResponseDtoArrayList =new ArrayList<>();
        for (User user : usersList){
            UserResponseDto getUserResponseDto =convertUserModelToUserDto(user);
            userResponseDtoArrayList.add(getUserResponseDto);
        }
        return userResponseDtoArrayList;
    }

    @Override
    public UserResponseDto getUserByIdUser(Integer id) {
        Optional<User> userModel = userRepo.findById(id);
        UserResponseDto userResponseDto = new UserResponseDto();
        if (userModel.isPresent()){
            userResponseDto = convertUserModelToUserDto(userModel.get());
        }
        return userResponseDto;
    }

    private UserResponseDto convertUserModelToUserDto(User user) {
        UserResponseDto getUserResponseDto = UserResponseDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .middleName(user.getMiddleName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .mobile(user.getMobile())
                .gender(user.getGender())
                .cin(user.getCin())
                .aadharNo(user.getAadharNo())
                .build();
        return getUserResponseDto;
}
    @Override
    public UserResponseDto createUser(UserRequestDto userRequestDto) {

        String cinNo= String.valueOf(LocalDateTime.now()).replaceAll("[^0-9]", "").substring(0,17);
        User user = convertUserRequestDtoToUser(userRequestDto);
        user.setCin(cinNo);
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy(1);
        user = userRepo.save(user);

        Account account = new Account();
        account.setUserId(user.getId());
        account.setAccType(userRequestDto.getAccountType());

        //getting account number here
        State state = stateRepository.findStateByName(userRequestDto.getState());
        District district =  districtRepository.findDistrictByName(userRequestDto.getDistrict());
        City city =  cityRepository.findCityByName(userRequestDto.getCity());

        //getting last acc number for increasing new by one
        String lastAccountNumber = accountRepository.findLastAccountNumber();

        String lastFourDigitAccountNum = lastAccountNumber.substring(lastAccountNumber.length()-4);
        // start ki length-4 = 10 number se  start hoga to last k 4 digit milege

        Integer parseFourDigitToInt = Integer.valueOf(lastFourDigitAccountNum)+1;
        //the above parsing into integer and adding 1


        String finalAccountNumber = String.format("%04d", parseFourDigitToInt);
/*
        System.out.println(String.format("%04d",city.getId()));
*/
        account.setAccNo(String.format("%02d",state.getId())+String.format("%04d",district.getId())+String.format("%04d",city.getId())+finalAccountNumber);
        account.setOpeningDate(LocalDate.now());
        account.setBalance(new BigDecimal("0.0"));
        account = accountRepository.save(account);


        UserCredentials userCredential = new UserCredentials();
        userCredential.setUserId(user.getId());
//        userCredential.setUserName(userRequestDto.getUserName());
        userCredential.setPassword(userRequestDto.getPassword());
        userCredential=userCredentialRepository.save(userCredential);

        Address address= new Address();
        address.setUserId(user.getId());
        address.setAddress(userRequestDto.getAddress());
        address.setPinCode(userRequestDto.getPincode());
        address = addressRepository.save(address);


        return convertUserToUserResponseDto(user , account , address, userCredential);
    }


    private User convertUserRequestDtoToUser(UserRequestDto userRequestDto) {
        return User.builder()
                .firstName(userRequestDto.getFirstName())
                .middleName(userRequestDto.getMiddleName())
                .lastName(userRequestDto.getLastName())
                .mobile(userRequestDto.getMobile())
                .email(userRequestDto.getEmail())
                .gender(userRequestDto.getGender())
                .dateofbirth(userRequestDto.getDateOfBirth())
                .aadharNo(userRequestDto.getAadharNo())
                .build();
    }

    private UserResponseDto convertUserToUserResponseDto(User user , Account account, Address address, UserCredentials userCredential ) {
        return UserResponseDto.builder()
                .firstName(user.getFirstName())
                .middleName(user.getMiddleName())
                .lastName(user.getLastName())
                .gender(user.getGender())
                .mobile(user.getMobile())
                .email(user.getEmail())
                .dob(user.getDateofbirth())
                .aadharNo(user.getAadharNo())
                .cin(user.getCin())
                .userName(userCredential.getUserName())
                .address(address.getAddress())
                .accountType(account.getAccType())
                .pincode(address.getPinCode())
                .build();
    }


    @Override
    public UserResponseDto updateUser(UserRequestDto userRequestDto) {
        Optional<User> optionalUser = userRepo.findById(userRequestDto.getId());

        if (optionalUser.isEmpty()){
            System.out.println("User data with id: " + userRequestDto.getId() + " not found");
        }else {
            User user= optionalUser.get();
            user.setFirstName(userRequestDto.getFirstName() != null && !userRequestDto.getFirstName()
                    .equals(user.getFirstName()) ? userRequestDto.getFirstName() : user.getFirstName());

            user.setMiddleName(userRequestDto.getMiddleName() != null && !userRequestDto.getMiddleName()
                    .equals(user.getMiddleName()) ? userRequestDto.getMiddleName() : user.getMiddleName());

            user.setLastName(userRequestDto.getLastName() != null && !userRequestDto.getLastName()
                    .equals(user.getLastName()) ? userRequestDto.getLastName() : user.getLastName());

            user.setGender(userRequestDto.getGender() != null && !userRequestDto.getGender()
                    .equals(user.getGender()) ? userRequestDto.getGender() : user.getGender());

            user.setEmail(userRequestDto.getEmail() != null && !userRequestDto.getEmail()
                    .equals(user.getEmail()) ? userRequestDto.getEmail() : user.getEmail());

            user.setMobile(userRequestDto.getMobile() != null && !userRequestDto.getMobile()
                    .equals(user.getMobile()) ? userRequestDto.getMobile() : user.getMobile());

            user.setDateofbirth(userRequestDto.getDateOfBirth() != null && !userRequestDto.getDateOfBirth()
                    .equals(user.getDateofbirth()) ? userRequestDto.getDateOfBirth() : user.getDateofbirth());

            user.setUpdatedBy(2);
            user.setUpdatedAt(LocalDateTime.now());
            userRepo.save(user);
            return convertUserToUserResponseDto2(user );
        }


        return UserResponseDto.builder().build();
    }



    private UserResponseDto convertUserToUserResponseDto2(User user) {
        return UserResponseDto.builder()
                .firstName(user.getFirstName())
                .middleName(user.getMiddleName())
                .lastName(user.getLastName())
                .gender(user.getGender())
                .mobile(user.getMobile())
                .email(user.getEmail())
                .dob(user.getDateofbirth())
                .aadharNo(user.getAadharNo())
                .build();
    }

    @Override
    public UserResponseDto getdetailsBybranchid(Integer id) {

        Integer branchId = accountRepository.findBranchIdByUserId(id);

        Optional<Branch>  branchModel = branchRepository.findById(branchId);
        UserResponseDto userDto = new UserResponseDto();
        if (branchModel.isPresent()) {
            userDto = convertBranchToUserGetResponseDto(branchModel.get());
        }
        return userDto;
    }

    private UserResponseDto convertBranchToUserGetResponseDto(Branch branch) {
        UserResponseDto userResponseDto = UserResponseDto.builder()
                .ifsc(branch.getIfscCode())
                .branchName(branch.getBranchName())
                .build();
        return userResponseDto;
    }
}


