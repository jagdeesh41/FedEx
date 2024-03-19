package com.example.customexceptions.controller;


import com.example.customexceptions.Entities.User;
import com.example.customexceptions.Errors.CustomErrorResponse;
import com.example.customexceptions.Errors.UserNotFoundException;
import com.example.customexceptions.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController
{

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> findAllUsers()
    {
        return ResponseEntity.ok().body(userService.findAllUsers());
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> findUserById(@PathVariable("id") int id)
    {
        User user=userService.findUserById(id).orElse(null);
        if(user==null)
        {
            throw new UserNotFoundException("Enter a valid user id");
        }
        else
        {
            return new ResponseEntity<User>(user, HttpStatus.OK);
        }


    }

    @ExceptionHandler

    public ResponseEntity<CustomErrorResponse> excecptionHandler(UserNotFoundException userNotFoundException)
    {
        CustomErrorResponse customErrorResponse=new CustomErrorResponse();

        customErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        customErrorResponse.setMessage(userNotFoundException.getMessage());
        customErrorResponse.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(customErrorResponse,HttpStatus.NOT_FOUND);



    }

    @ExceptionHandler
    public ResponseEntity<CustomErrorResponse>exceptionHandler(RuntimeException runtimeException)
    {
        CustomErrorResponse customErrorResponse=new CustomErrorResponse();
        customErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        customErrorResponse.setMessage(runtimeException.getMessage());
        customErrorResponse.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(customErrorResponse,HttpStatus.BAD_REQUEST);

    }



    @PostMapping("/users")
    public ResponseEntity<User> addUser(@RequestBody User user)
    {
        return ResponseEntity.ok().body(userService.addUser(user));

    }






}
