package com.cg;

import javax.annotation.*;

public class Book {
 
private String isbn;
private String year;
private Author author;
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}


void setUp(){
	System.out.println("This is setUp()");
}
void cleanup(){
	System.out.println("This is cleanUp()");
}
@PostConstruct
void customInit(){
	System.out.println("This is customInit() in Book");
}
@PreDestroy
void customDestroy(){
	System.out.println("This is customDestroy in Book");
}
@Override
public String toString() {
	return "Book [isbn=" + isbn + ", year=" + year + ", author=" + author + "]";
}

	
}
