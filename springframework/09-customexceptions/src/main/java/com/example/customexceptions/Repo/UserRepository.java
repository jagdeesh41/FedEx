package com.example.customexceptions.Repo;

import com.example.customexceptions.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Integer> {

}
