package com.fev.taskmanager.model;

public class Task {
	private int ID;
	private String title;
	private String description;

	public Task() {

	}

	public Task(int iD, String title, String description) {
		super();
		ID = iD;
		this.title = title;
		this.description = description;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
