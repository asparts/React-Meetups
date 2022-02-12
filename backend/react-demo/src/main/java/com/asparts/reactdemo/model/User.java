package com.asparts.reactdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class User {
	@Id
	@Column(name="ID", nullable = false, unique = true)
	private int id;
	@Column(name="Username", nullable = false, unique = true)
	private String username;
	@Column(name="Password", nullable = false)
	private String password;
	@Column(name="Email", nullable = false)
	private String email;
	@Column(name="Phone", nullable = false)
	private String phone;
	@Column(name="FirstName", nullable = false)
	private String firstName;
	@Column(name="LastName", nullable = false)
	private String lastName;
	@Column(name="UserRole")
	private int userRole;
	//private Date creationDate;
	//private Date lastLoginDate;
	
	public User() {
		
	}
	public User(int id, String username, String password, String email, 
			String phone, String firstName, String lastName) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getUserRole() {
		return userRole;
	}
	public void setUserRole(int userRole) {
		this.userRole = userRole;
	}
//	public Date getCreationDate() {
//		return creationDate;
//	}
//	public void setCreationDate(Date creationDate) {
//		this.creationDate = creationDate;
//	}
//	public Date getLastLoginDate() {
//		return lastLoginDate;
//	}
//	public void setLastLoginDate(Date lastLoginDate) {
//		this.lastLoginDate = lastLoginDate;
//	}

}
