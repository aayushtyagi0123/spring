package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
    
	@Id
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String title;
	private String content;

	
	public Todo(int id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", content=" + content + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
}
