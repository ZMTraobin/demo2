package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "com_cmig_zrgk_user")
@Data
public class UserJpaEntity implements Serializable{
	
	 private static final long serialVersionUID = 1L;
	 @Id
	 private long id;
	 @Column(nullable = false)
	 private String uname;
	 @Column(nullable = false)
	 private String password;
	 @Column(nullable = false)
	 private String age;

}
