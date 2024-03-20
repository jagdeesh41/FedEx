package com.springbootstarter.starter;

import lombok.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarterApplication
{
	public StarterApplication()
	{
		System.out.println("im invoked"+getClass().getSimpleName());

	}

	public static void main(String[] args)
	{
		SpringApplication.run(StarterApplication.class, args);
	}


}
