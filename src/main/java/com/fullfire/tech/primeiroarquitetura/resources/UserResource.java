package com.fullfire.tech.primeiroarquitetura.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST esta funcionando!";
	}

}
