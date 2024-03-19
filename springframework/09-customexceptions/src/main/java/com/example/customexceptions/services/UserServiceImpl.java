package com.example.customexceptions.services;


import com.example.customexceptions.Entities.User;
import com.example.customexceptions.Repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAllUsers()
    {
        return userRepository.findAll();




    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);

    }

    @Override
    public Optional<User> findUserById(int id)
    {
        return userRepository.findById(id);

    }
}
