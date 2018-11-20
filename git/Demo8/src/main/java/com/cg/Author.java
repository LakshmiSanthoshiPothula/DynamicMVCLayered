package com.cg;
import javax.annotation.*;
public class Author {

	private String authorName;
	private String address;
	public Author(String authorName, String address) {
		super();
		this.authorName = authorName;
		this.address = address;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@PostConstruct
	void customInit(){
		System.out.println("This is customInit() in Author");
	}
	@PreDestroy
	void customDestroy(){
		System.out.println("This is customDestroy() in Author");
	}
	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", address=" + address
				+ "]";
	}
	
}
