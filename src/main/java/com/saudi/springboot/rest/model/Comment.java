package com.saudi.springboot.rest.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.stereotype.Component;

@Component

@Entity
@Table(name= "comment")

@DynamicInsert
@DynamicUpdate
public class Comment {


	@Id
	//@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	private int post_id;
	
	private String name;
	
	private String email;	
	
	private String body;

	public Comment() { }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPost_id() {
		return post_id;
	}

	public void setPost_id(int post_id) {
		this.post_id = post_id;
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

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", post_id=" + post_id + ", name=" + name + ", email=" + email + ", body=" + body
				+ "]";
	}


	
}