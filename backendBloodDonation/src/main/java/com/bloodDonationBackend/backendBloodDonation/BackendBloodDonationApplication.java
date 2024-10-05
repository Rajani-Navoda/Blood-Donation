package com.bloodDonationBackend.backendBloodDonation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class BackendBloodDonationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendBloodDonationApplication.class, args);
	}

}
