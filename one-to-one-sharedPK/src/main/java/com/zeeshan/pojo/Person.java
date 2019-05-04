package com.zeeshan.pojo;

public class Person {

	private int personId,age;
	private String name, email;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", age=" + age + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
