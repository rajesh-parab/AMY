package com.amy.banking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping(method = RequestMethod.POST)
	public String printHello(@ModelAttribute("SpringWeb") LoginForm login,
			ModelMap model) {
		 
		 model.addAttribute("userName", login.getUserName());
		 model.addAttribute("age", login.getAge());
		     
		return "result";
		 
	}
}
