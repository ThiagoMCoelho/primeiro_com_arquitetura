package com.fullfire.tech.primeiroarquitetura.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fullfire.tech.primeiroarquitetura.domain.User;

@RestController
@RequestMapping(value = "/user")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<User> listar() {

		User user1 = new User(1,"Thiago","Coelho",36);
		User user2 = new User(2,"Elaine","Coelho",33);
		
		List<User> listUser = new ArrayList<>();
		listUser.add(user1);
		listUser.add(user2);
		
		return listUser;
		
	}

}
