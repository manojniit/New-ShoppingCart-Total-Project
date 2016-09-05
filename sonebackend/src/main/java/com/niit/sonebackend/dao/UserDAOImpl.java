package com.niit.sonebackend.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.sonebackend.model.User;
@EnableTransactionManagement
@Repository(value="userDAO")
public class UserDAOImpl implements UserDAO{
	@Autowired
SessionFactory sessionFactory;
	public UserDAOImpl(SessionFactory sessionFactory)
	 {
		 this.sessionFactory=sessionFactory;
	 }
@Transactional
public boolean save(User user) {
	// TODO Auto-generated method stub
	sessionFactory.getCurrentSession().save(user);
	return true;
}
@Transactional
public boolean update(User user) {
	// TODO Auto-generated method stub
	sessionFactory.getCurrentSession().update(user);
	return true;
}
@Transactional
public boolean delete(User user) {
	// TODO Auto-generated method stub
	sessionFactory.getCurrentSession().delete(user);
	return true;
}
@Transactional
public User get(String id) {
	// TODO Auto-generated method stub
	String hql = "from User where id="+"'"+id+"'";
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	List<User> list = query.list();
	if(list==null||list.isEmpty())
	{
		return null;
	}else{
	return list.get(0);
	}
}
@Transactional
public List<User> list() {
	// TODO Auto-generated method stub
	String hql ="from User";
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	List<User> list= query.list();
	if(list==null||list.isEmpty())
	{
		return null;
	}
	else{
		return list;
	}
	
}
}
