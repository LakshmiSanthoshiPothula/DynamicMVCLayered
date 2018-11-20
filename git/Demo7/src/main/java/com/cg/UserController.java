package com.cg;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Scope("session")
@Controller
@RequestMapping(value="user")
public class UserController {
	
	@RequestMapping(value="/showLogin")
	public String prepareLogin(Model model)
	{
		System.out.println("in prepareLogin() method ");
		model.addAttribute("login", new Login());
		return "login";
	}
	
	@RequestMapping(value="/checkLogin")
	public String checkLogin()
	{ 
		//validate userName and password againse databaseS
		return "loginSuccess";
		
	}
	
	@RequestMapping(value="/showRegister")
	public String showRegister(Model model)
	{
		System.out.println("in shoWRegister() method");
		model.addAttribute("register", new User());
		return "register";
		
	}
	

	@RequestMapping(value="/checkRegister")
	public String checkRegister(User user,Model model){
		model.addAttribute("user",user);
		return "registerSuccess";
		
	}
	
	
	
	

}
