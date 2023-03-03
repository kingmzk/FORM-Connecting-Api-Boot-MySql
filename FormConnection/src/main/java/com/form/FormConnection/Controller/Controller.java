package com.form.FormConnection.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.form.FormConnection.model.Model;
import com.form.FormConnection.service.Service;



@RestController
@RequestMapping("/form")
@CrossOrigin
public class Controller
{
	@Autowired
	private Service service;
	
	
	@PostMapping("/addform")
	public String addModel(@RequestBody Model model) {
		
		System.out.println(model.getEmail());
		
		service.addModel(model);
		return "New User Added";
		
	}
	
	
	@GetMapping("/u")
	public String addUser() {
		return "<h1>KingMZK</h1>";
	}

}
