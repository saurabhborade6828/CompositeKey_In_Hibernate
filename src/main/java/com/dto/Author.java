package com.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Author implements Serializable
{
   private String authorname;
   private String publisher;
   
public String getAuthorname() {
	return authorname;
}
public void setAuthorname(String authorname) {
	this.authorname = authorname;
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
   
   
}
