package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import org.modelmapper.ModelMapper;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}

}
