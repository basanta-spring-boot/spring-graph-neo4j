package com.basant.spring.boot.neo4j.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basant.spring.boot.neo4j.api.dao.UserRepository;
import com.basant.spring.boot.neo4j.api.model.User;

@RestController
public class UserController {

	@Autowired
	private UserRepository repository;

	@PostConstruct
	public void save() {
		List<User> users = new ArrayList<>();
		users.add(new User(4754, "Basant", "IT"));
		users.add(new User(8096, "Santosh", "NIT"));
		repository.saveAll(users);
	}

	@GetMapping("/getAll")
	public Set<User> getAll() {
		Set<User> set = new HashSet<>();
		List<User> users = (List<User>) repository.findAll();
		set.addAll(users);
		return set;
	}

}
