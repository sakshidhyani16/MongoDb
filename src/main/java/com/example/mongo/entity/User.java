package com.example.mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {
	
	 @Transient
	    public static final String SEQUENCE_NAME = "user_sequence";
	    @Id
	    private long id;
	    private String name;
	    private String email;
	    private int age;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public static String getSequenceName() {
			return SEQUENCE_NAME;
		}
	    
	    

}
