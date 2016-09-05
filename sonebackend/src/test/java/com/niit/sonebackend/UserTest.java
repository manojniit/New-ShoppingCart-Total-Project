package com.niit.sonebackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.sonebackend.dao.UserDAO;
import com.niit.sonebackend.model.User;

public class UserTest {
	
	public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.scan("com.niit");
	context.refresh();
	UserDAO userDAO = (UserDAO) context.getBean("userDAO");
	User user = (User) context.getBean("user");
	user.setName("ganesh");
	user.setId("4CZ");
	user.setPassword("vemuri");
	user.setMail("ganeshvemuriv@gmail.com");
	user.setMobileno("8185956671");
	if(userDAO.save(user)==true)
	{
		System.out.println("a");
	}
	else{
		System.out.println("b");
	}
	}

}
