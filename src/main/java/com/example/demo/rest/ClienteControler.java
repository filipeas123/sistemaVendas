package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.entity.Cliente;
import com.example.demo.model.repository.ClienteReposiroty;

@RestController
@RequestMapping("/api/clientes")
public class ClienteControler {


	private final ClienteReposiroty repository;
	
	
	@Autowired
	public ClienteControler(ClienteReposiroty reposiroty) {
		this.repository = reposiroty;
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public  Cliente save(@RequestBody  Cliente  cliente) {
		
		return repository.save(cliente);
		
	}
	
	
	
	
}
