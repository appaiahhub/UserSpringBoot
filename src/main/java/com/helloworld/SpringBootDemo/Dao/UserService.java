package com.helloworld.SpringBootDemo.Dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserService {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	@Column
	private String Name;

}
