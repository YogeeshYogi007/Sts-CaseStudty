package com.example.profile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profile {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String SirName;
	private String FirstName;
	private String LastName;
	private int age;
	private String Bio;
	private String gender;
	private String photo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSirName() {
		return SirName;
	}
	public void setSirName(String sirName) {
		SirName = sirName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBio() {
		return Bio;
	}
	public void setBio(String bio) {
		Bio = bio;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Profile(int id, String sirName, String firstName, String lastName, int age, String bio, String gender,
			String photo) {
		this.id = id;
		SirName = sirName;
		FirstName = firstName;
		LastName = lastName;
		this.age = age;
		Bio = bio;
		this.gender = gender;
		this.photo = photo;
	}
	public Profile() {
	}
	
	
	
	
}
