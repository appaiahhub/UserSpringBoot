package com.helloworld.SpringBootDemo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@RequestMapping(value="/")
	public String Login() {
		
		return "Hellow";
	}

}
