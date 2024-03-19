package com.example.dtopattern.mapper;

import com.example.dtopattern.dto.UserDto;
import com.example.dtopattern.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class UserMapper
{
    //convert User JPA entity into UserDto
    public static UserDto convertFromUserToUserDto(User user)
    {
        UserDto userDto=new UserDto(user.getId(), user.getFirstName(), user.getLastName(),user.getEmail());

        return userDto;


    }

    //convert User DTO into User Jpa

    public static User convertFromUserDtoToUser(UserDto userDto)
    {
        User user=new User(userDto.getId(),userDto.getFirstName(),userDto.getLastName(),userDto.getEmail());
        return user;
    }

    public static List<User> convertFromUserDtoListToUserList(List<UserDto> userDtos)
    {
        List<User> users=new ArrayList<>();
        for(UserDto ele:userDtos)
        {
            User user=convertFromUserDtoToUser(ele);
            users.add(user);
        }
        return users;

    }

    public static List<UserDto> convertFromUserListToUserDtoList(List<User> users)
    {
        List<UserDto> userDtos=new ArrayList<>();
        for(User ele:users)
        {
            UserDto userDto=convertFromUserToUserDto(ele);
            userDtos.add(userDto);
        }
        return userDtos;

    }

}
