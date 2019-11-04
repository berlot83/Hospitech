package com.molokotech.rest;

import java.security.Principal;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class UserController {
	  @RequestMapping("/user")
	  public Principal user(Principal principal) {
	    return principal;
	  }
	
}
