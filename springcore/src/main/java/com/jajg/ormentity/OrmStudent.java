package com.jajg.ormentity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OrmStudent")
public class OrmStudent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String subject;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public OrmStudent() {
		
	}
	public OrmStudent(String name, String subject) {
		
		this.name = name;
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "OrmStudent [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}
	
	
	
}
