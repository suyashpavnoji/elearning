package org.elearning.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/register")
public class RegistrationController {
	@RequestMapping(method = RequestMethod.GET)
	   public String registerUser(ModelMap model) {
		 //model.	
	      model.addAttribute("message", "Hello Spring MVC Framework!");

	      return "hello";
	   }

}
