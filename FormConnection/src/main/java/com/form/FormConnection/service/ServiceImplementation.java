package com.form.FormConnection.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.form.FormConnection.model.Model;
import com.form.FormConnection.repository.Repository;

@org.springframework.stereotype.Service
public class ServiceImplementation implements Service
{
	@Autowired
	private Repository repository;
	@Override
	public Model addModel(Model model) 
	{
	
		System.out.println("Service is Working");
		
		return repository.save(model);
	}

}
