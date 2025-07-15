package com.hotalbooking.system.controller;
import java.util.List;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotalbooking.system.model.Hotel;

@RestController()
@RequestMapping("/hotelRegistration")
public class HotelRegistrationController {
	
	@GetMapping("/ping")
	public ResponseEntity<String> ping(){
		return new ResponseEntity<String>("Ping Success ",HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Hotel>> getHotels(){
		return 
	}
	
}

