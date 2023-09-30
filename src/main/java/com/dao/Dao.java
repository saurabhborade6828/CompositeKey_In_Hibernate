package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.Book;

public class Dao 
{ 
	  private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	  private EntityManager entityManager = entityManagerFactory.createEntityManager();
	  private EntityTransaction entityTransaction = entityManager.getTransaction();
	  
	  public void save(Book book)
	  {
		  entityTransaction.begin();
		  entityManager.persist(book);
		  entityTransaction.commit();
	  }
	  
}  
