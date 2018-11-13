package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
@Data
@Document(collection = "family")
public class UserEntity implements Serializable {
	
	 private static final long serialVersionUID = 1L;
	 
	    //id主键
		@Id
		private String id;
		//nullabe:是否可以为空。unique:是否唯一
		@Field("name")
		private String name;
		@Field("discription")
		private String discription;
		@Field("age")
		private String age;

}
