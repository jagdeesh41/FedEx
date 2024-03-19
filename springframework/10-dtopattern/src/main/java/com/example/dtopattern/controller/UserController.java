package com.example.dtopattern.controller;


import com.example.dtopattern.dto.UserDto;
import com.example.dtopattern.entity.User;
import com.example.dtopattern.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
@NoArgsConstructor

public class UserController
{
    @Autowired
    private UserService userService;

    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping("/users")
    public ResponseEntity<List<UserDto>> getAllUsers()
    {
        List<UserDto> users=userService.getAllUsers();
        return new ResponseEntity<List<UserDto>>(users,HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/users")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto user)
    {
        UserDto user1=userService.createUser(user);
        return new ResponseEntity<>(user1,HttpStatus.OK);

    }
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping("/users/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") int id)
    {
        UserDto user=userService.getUserById(id);
        return new ResponseEntity<>(user,HttpStatus.OK);


    }
    @PreAuthorize("hasRole('ADMIN")
    @PutMapping("/users/{id}")
    public ResponseEntity<UserDto> updateUser (@PathVariable("id") int id,@RequestBody UserDto user)
    {
        UserDto user1=userService.updateUser(id,user);
        return new ResponseEntity<>(user1,HttpStatus.OK);

    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") int id)
    {
        userService.deleteUser(id);
    }






}
