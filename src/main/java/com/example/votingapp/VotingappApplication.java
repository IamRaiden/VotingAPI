package com.example.votingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class VotingappApplication {

	public static void main(String[] args) {
		SpringApplication.run(VotingappApplication.class, args);
	}

}
