package com.asparts.reactdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "meetups")
public class Meetup {

	@Id
	@Column(name="ID", nullable = false, unique = true)
	private int id;
	@Column(name="UserID", nullable = false)
	private int userId;
	@Column(name = "Title", nullable = false)
	private String title;
	@Column(name = "Image", nullable = true)
	private String image;
	@Column(name = "Address", nullable = false)
	private String address;
	@Column(name = "Description", nullable = false)
	private String description;
	
	
	public Meetup() {}
	
	public Meetup(int id, int userId, String title, String image, String address, String des) {
		
		this.id = id;
		this.userId = id;
		this.title = title;
		this.image = image;
		this.address = address;
		this.description = des;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
