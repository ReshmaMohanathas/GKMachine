package com.example.HandsonSpring.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.HandsonSpring.model.User;

@Repository
public class usingJDBCtemplate {
	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	String INSERT_QUERY=
			"""
			INSERT INTO USER(id,name)
			values(?,?);
			""";
	
	public ResponseEntity<String> addCourse(User user) {
		
		jdbctemplate.update(INSERT_QUERY,user.getId(),user.getName());
		
		return new ResponseEntity<String>("Course added",HttpStatus.CREATED);
	}
	
}
