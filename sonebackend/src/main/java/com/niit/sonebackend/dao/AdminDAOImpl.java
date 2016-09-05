package com.niit.sonebackend.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.sonebackend.model.Admin;
@EnableTransactionManagement
@Repository(value="adminDAO")
public class AdminDAOImpl implements AdminDAO {
	@Autowired
 private SessionFactory sessionFactory;
 public AdminDAOImpl(SessionFactory sessionFactory)
 {
	 this.sessionFactory=sessionFactory;
 }
 @Transactional
	public boolean save(Admin admin)
	{
		sessionFactory.getCurrentSession().save(admin);
		return true;
	}
 @Transactional
	public boolean update(Admin admin) {
		sessionFactory.getCurrentSession().update(admin);
		return true;
	}
 @Transactional
	public boolean delete(Admin admin) {
		sessionFactory.getCurrentSession().delete(admin);
		return true;
	}
 @Transactional
	public Admin get(String id) {
		String hql ="from Admin where id ="+"'"+id+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Admin> list = query.list();
		if(list==null||list.isEmpty())
		{
			return null;
		}
		else{
		return list.get(0);
		}
	}
	

}
