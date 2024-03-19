package com.example.customexceptions.services;

import com.example.customexceptions.Entities.User;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAllUsers();

    User addUser(User user);

    Optional<User> findUserById(int id);
}
