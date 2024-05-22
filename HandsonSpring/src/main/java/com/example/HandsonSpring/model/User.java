package com.example.HandsonSpring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	long id;
	String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + "]";
	}
	public User(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	
}
