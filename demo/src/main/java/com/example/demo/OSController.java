package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OSController {

	
	@GetMapping("/message")
	public ResponseEntity<String> getMessage(){
		return new ResponseEntity<>("Success",HttpStatus.OK);
	}
}
