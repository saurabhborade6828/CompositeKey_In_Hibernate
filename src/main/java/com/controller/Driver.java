package com.controller;

import com.dao.Dao;
import com.dto.Author;
import com.dto.Book;

public class Driver 
{
   public static void main(String[] args) 
   {
	   Book book = new Book();
	   book.setBname("Harry Potter");
	   book.setPrice(350);
	   
	   Author author = new Author();
	   author.setAuthorname("J K Rowling");
	   author.setPublisher("Bloomsbury");
	   
	   book.setAuthor(author);
	   
	   Dao dao = new Dao();
	   dao.save(book);
   }
}
