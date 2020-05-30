package com.example.demo.model;

import java.time.LocalDate;

import lombok.ToString;

//@ToString(includeNames=true,includeSuper=true)
@ToString
public class UserLombokModel {
	/*
	 * @Override public String toString() { return "UserLombokModel [id=" + id +
	 * ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age +
	 * ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", gender="
	 * + gender + "]"; }
	 */
	private long id;
    private String firstName;
    private String lastName;
   // @Getter @Setter
    private int age;
    private LocalDate createdDate;
    private LocalDate updatedDate;
    private String gender;

}