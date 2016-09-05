package com.niit.sonebackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.sonebackend.dao.AdminDAO;
import com.niit.sonebackend.model.Admin;

public class AdminTest {
 public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.niit");
	context.refresh();
	AdminDAO adminDAO = (AdminDAO) context.getBean("adminDAO");
	Admin admin= (Admin) context.getBean("admin");
	admin.setName("Manoj kumar");
	admin.setPassword("tejasri");
	admin.setId("4CQ");
	
	if(adminDAO.save(admin)==true)
	{
		System.out.println("a");
	}else
	{
		System.out.println("b");
	}

}
}
