package com.example.dtopattern.service;

import com.example.dtopattern.dto.UserDto;
import com.example.dtopattern.entity.User;
import com.example.dtopattern.mapper.UserMapper;
import com.example.dtopattern.repository.UserRepository;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;


@NoArgsConstructor
@AllArgsConstructor
@Service
public class UserServiceImpl implements  UserService
{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Autowired
    private EntityManager entityManager;






    @Override
    public UserDto createUser(UserDto userDto)
    {


        //convert user dto into user JPA Entity
//        User user=new User();
//        user.setId(user.getId());
//        user.setEmail(userDto.getEmail());
//        user.setLastName(userDto.getLastName());
//        user.setFirstName(userDto.getFirstName());

        //we are converting userDtoToUser


//        User user= UserMapper.convertFromUserDtoToUser(userDto);

        User user=modelMapper.map(userDto,User.class);


//        User user= modelMap.map()
        User savedUser=userRepository.save(user);

        //convert User Jpa entity to UserDto

//        UserDto savedUserDto=new UserDto();
//        savedUserDto.setId(savedUser.getId());
//        savedUserDto.setEmail(savedUser.getEmail());
//        savedUserDto.setFirstName(savedUser.getFirstName());
//        savedUserDto.setLastName(savedUser.getLastName());

        //we need to convert userToUserDto

//        UserDto userDto1= UserMapper.convertFromUserToUserDto(savedUser);

        UserDto userDto1=modelMapper.map(savedUser,UserDto.class);




        return userDto1;






    }

    @Override
    public List<UserDto> getAllUsers()
    {
        List<User> users=userRepository.findAll();
//        return userMapper.convertFromUserListToUserDtoList(users);
//        return users.stream().map(UserMapper::convertFromUserToUserDto).collect(Collectors.toList());
        return users.stream().map(user -> modelMapper.map(user,UserDto.class)).collect(Collectors.toList());



    }

    @Override
    public UserDto getUserById(int id)
    {
        User user=userRepository.findById(id).orElse(null);
//        UserDto userDto= UserMapper.convertFromUserToUserDto(user);
        UserDto userDto=modelMapper.map(user,UserDto.class);
        return userDto;

    }

    @Override
    public UserDto updateUser(int id,UserDto userDto)
    {


        User user=userRepository.findById(id).orElse(null);

//        UserMapper.convertFromUserDtoToUser(userDto);

        modelMapper.map(userDto,User.class);

        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());

        userRepository.save(user);


//        return UserMapper.convertFromUserToUserDto(user);
        return modelMapper.map(user,UserDto.class);










    }

    @Override
    public void deleteUser(int userId)
    {
        userRepository.deleteById(userId);


    }


}
