package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.model.StudentFS;

@Repository
public class StudentDao {
	
	@Autowired
	SessionFactory factory;
	
	public String registerData(StudentFS sfs) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(sfs);
		transaction.commit();
		session.close();
		return "Registerd successfully..";
	}
	
	public List<StudentFS> getAllStudent(){
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(StudentFS.class);
		
		return criteria.list();
	}
}
