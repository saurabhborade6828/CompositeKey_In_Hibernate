package com.dto;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Story")
public class Book 
{
   private String bname;
   private double price;
   
   @EmbeddedId
   private Author author;

public String getBname() {
	return bname;
}

public void setBname(String bname) {
	this.bname = bname;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Author getAuthor() {
	return author;
}

public void setAuthor(Author author) {
	this.author = author;
}
   
   
   
}
