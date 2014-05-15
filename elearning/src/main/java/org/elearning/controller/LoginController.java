package org.elearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/login")
public class LoginController {
	@RequestMapping(method=RequestMethod.POST)
	public boolean isAuthenticated()
	{
		
		return false;
	}
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public ModelAndView newShopPage() {
		ModelAndView mav = new ModelAndView("shop-new", "shop", new Object());
		return mav;
	}

}
