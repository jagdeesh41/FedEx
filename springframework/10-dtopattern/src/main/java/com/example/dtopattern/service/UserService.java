package com.example.dtopattern.service;

import com.example.dtopattern.dto.UserDto;
import com.example.dtopattern.entity.User;

import java.util.List;

public interface UserService
{
    UserDto createUser(UserDto user);
    List<UserDto> getAllUsers();

    UserDto getUserById(int id);

    UserDto updateUser(int id,UserDto userDto);

    void deleteUser(int userId);
}
