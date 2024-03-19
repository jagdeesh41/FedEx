package com.example.dtopattern;

import jakarta.persistence.EntityManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.modelmapper.ModelMapper;


@SpringBootApplication
public class DtopatternApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(DtopatternApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();


	}











}
