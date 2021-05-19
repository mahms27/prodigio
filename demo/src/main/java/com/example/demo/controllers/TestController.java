package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@GetMapping(value = "test")
	public ResponseEntity<String> test(){
		return ResponseEntity.ok("test"); 
	}
}