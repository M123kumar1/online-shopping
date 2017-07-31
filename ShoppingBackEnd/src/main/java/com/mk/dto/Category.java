package com.mk.dto;

public class Category {
	private int id;
	private String name;
	private String description;
	private String imagrUrl;
	private boolean active;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImagrUrl() {
		return imagrUrl;
	}

	public void setImagrUrl(String imagrUrl) {
		this.imagrUrl = imagrUrl;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
