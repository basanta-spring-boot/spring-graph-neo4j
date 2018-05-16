package com.basant.spring.boot.neo4j.api.model;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	private int id;
	private String name;
	private String dept;


}
