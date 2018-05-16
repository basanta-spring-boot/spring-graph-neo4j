package com.basant.spring.boot.neo4j.api.dao;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.basant.spring.boot.neo4j.api.model.User;

public interface UserRepository extends Neo4jRepository<User, Integer>{

}
