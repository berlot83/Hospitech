package com.molokotech.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.molokotech.model.ClinicResume;
import com.molokotech.model.Person;
import com.molokotech.model.User;
import com.molokotech.services.PersonService;
import com.molokotech.services.UserService;
@RestController
@RequestMapping("/person/")
public class PersonRest {

	@Autowired
	PersonService personService;
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public @ResponseBody Person create(@ModelAttribute Person person, @ModelAttribute User user) throws Exception {
		if(user != null) {
			User userDB = userService.readByUsername(user.getUsername());
			if(userDB == null) {
				userService.create(user); 						/* Creó el usuario */
				user.setClinicResume(new ClinicResume());
				user.setPerson(person);   						/* Le seteó una Person  */
				return personService.create(person); /* Creó la Person e insertó el dato person_id el en la tabla users */
			}else {
				throw new Exception("El nombre de usuario está elegido o hubo un problema con los datos ingresados.");
			}
		}else {
			throw new Exception("El objeto llegó null al servidor.");
		}
	}
	
}
