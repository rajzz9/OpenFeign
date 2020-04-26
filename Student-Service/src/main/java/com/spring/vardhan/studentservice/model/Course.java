package com.spring.vardhan.studentservice.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Course {

	private int id;
	private String name;
	private boolean isLab;

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

	public boolean isLab() {
		return isLab;
	}

	public void setLab(boolean isLab) {
		this.isLab = isLab;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", isLab=" + isLab + "]";
	}

}
