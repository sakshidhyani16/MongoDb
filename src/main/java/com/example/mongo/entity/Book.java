package com.example.mongo.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "books")
public class Book {
	
    
    @Transient
    public static final String SEQUENCE_NAME = "book_sequence";
    @Id
    private long id;
    private String title;
    private String author;

	
    
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(long id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}

	
    // Constructors, getters, setters
}