package com.niit.sonebackend.dao;

import org.springframework.stereotype.Repository;

import com.niit.sonebackend.model.Admin;
@Repository
public interface AdminDAO {
	public boolean save(Admin admin);
	public boolean update(Admin admin);
	public boolean delete(Admin admin);
	public Admin get(String id);
	

}
