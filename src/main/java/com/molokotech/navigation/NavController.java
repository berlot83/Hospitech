package com.molokotech.navigation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {

	@GetMapping("/index")
	public String index1(){
		return "index";
	}
	
	@GetMapping("/")
	public String index2(){
		return "index";
	}
	
	@GetMapping("/default")
	public String layout(){
		return "default";
	}
	
	@GetMapping("/register")
	public String register(){
		return "register";
	}
	
	@GetMapping("/turns")
	public String turns(){
		return "turns";
	}
	
	@GetMapping("/illnesses")
	public String illnesses(){
		return "illnesses";
	}
	
	@GetMapping("/secured")
	public String secured(){
		return "secured";
	}
}
