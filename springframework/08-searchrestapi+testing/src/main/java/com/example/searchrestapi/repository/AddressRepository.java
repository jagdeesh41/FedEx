package com.example.searchrestapi.repository;

import com.example.searchrestapi.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long>
{



}
