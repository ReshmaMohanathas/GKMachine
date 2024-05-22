package com.example.HandsonSpring.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.HandsonSpring.Repo.usingJDBCtemplate;
import com.example.HandsonSpring.Repo.usingSpringJPA;

@RestController
class DummyController {
	
	@Autowired
	usingJDBCtemplate repo;
	
	@Autowired
	usingSpringJPA jparepo;
	
	
//	@PostMapping("/addCourse")
//	public ResponseEntity<String> addCourse(@RequestBody User user) {
//		
//			return repo.addCourse(user);
//
//		
//		
//	}
	
	@GetMapping("/dummy")
	public ResponseEntity<String> display(@RequestParam(required=false) String name){
		if (name==null) {
		return new ResponseEntity<String>("400",HttpStatusCode.valueOf(400));
		}
		else {
			return new ResponseEntity<String>("Hi..."+name,HttpStatusCode.valueOf(200));
		}
	}
	
}
