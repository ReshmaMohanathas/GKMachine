package com.example.HandsonSpring.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.HandsonSpring.model.User;


@Repository
public interface usingSpringJPA extends JpaRepository<User, Long>{
	User findByName(String name);
}