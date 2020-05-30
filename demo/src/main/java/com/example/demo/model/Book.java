package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;



@Document(collection = "Book")

@ToString
//@ToString(includeNames=true,includeSuper=true)
public class Book {
	/*
	 * @Override public String toString() { return "Book [id=" + id + ", bookName="
	 * + bookName + ", bookAuth=" + bookAuth + "]"; }
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuth() {
		return bookAuth;
	}
	public void setBookAuth(String bookAuth) {
		this.bookAuth = bookAuth;
	}
	@Id
	private int id;
	private String bookName;
	private String bookAuth;

}
