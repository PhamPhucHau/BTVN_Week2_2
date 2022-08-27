package com.example.BTVN_Week2_2;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BtvnWeek22Application {

	public static void main(String[] args) {
		SpringApplication.run(BtvnWeek22Application.class, args);
	}
	@Bean
	ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
