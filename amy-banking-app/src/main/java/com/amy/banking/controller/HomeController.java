package com.amy.banking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("home")
public class HomeController {

	@RequestMapping(method = RequestMethod.GET)
	   public ModelAndView printHello(ModelMap model) {
	      

	      return new ModelAndView("login", "command", new LoginForm()); 
	   }
}
