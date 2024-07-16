package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.StudentDao;
import com.tka.model.StudentFS;

@Service
public class StudentService {

	@Autowired
	StudentDao dao;
	
	public String registerData(StudentFS sfs) {
		return dao.registerData(sfs);
	}

	public StudentFS verifyLoginData(String uname, String pwd) {
		
		List<StudentFS> list = dao.getAllStudent();
		StudentFS f=null;
	
		for(StudentFS s : list) {
			if(s.getUsername().equals(uname) && s.getPassword().equals(pwd)) {
				f = s;
				break;
			}
		}
		return f;		
	}
	
	public List<StudentFS> getAllStudent(){
		return dao.getAllStudent();
	}
}
