package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tka.model.StudentFS;
import com.tka.service.StudentService;

@Controller
//@RequestMapping("/studentfs")
public class StudentController {

	@Autowired
	StudentService service;
	
	@GetMapping("/welcome")
	public String welcomeStudent() {
		System.out.println("welcome");
		return "Welcome";
	}
	
	@PostMapping("/registerData")
	public String registerData(@ModelAttribute StudentFS sfs, Model m) {
		
		System.out.println(sfs);
		m.addAttribute("message",service.registerData(sfs));
		return "Welcome";
	}
	
	@PostMapping("/loginData")
	public String loginData(@RequestParam String username,@RequestParam String
			  password, Model m) {
		
		System.out.println(username);
		StudentFS s = service.verifyLoginData(username,password);
		m.addAttribute("student",s);
		return "success";
	}
	
	@GetMapping("/Student")
	public String getAllStudent(Model m) {
		List<StudentFS> list = service.getAllStudent();
		m.addAttribute("l",list);
		return "StudentInfo";
	}
}
