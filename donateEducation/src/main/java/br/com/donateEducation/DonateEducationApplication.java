package br.com.donateEducation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DonateEducationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonateEducationApplication.class, args);
		
		System.out.println("Test donate Education...");
	}

}
