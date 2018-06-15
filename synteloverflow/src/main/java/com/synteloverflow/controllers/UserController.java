package com.synteloverflow.controllers;

import java.security.Principal;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.synteloverflow.models.User;
import com.synteloverflow.services.QuestionService;
import com.synteloverflow.services.UserService;
import com.synteloverflow.validator.UserValidator;



@Controller
public class UserController {
	private UserService userService;
	private UserValidator userValidator;
	@Autowired
	QuestionService qService;
	public UserController(UserService userService,UserValidator userValidator) {
		this.userService = userService;
		this.userValidator = userValidator;
	}
	//enables us to get name of our principal(current user)
	//
	@RequestMapping(value = {"/","/home"})
	public String home(Principal principal,Model model) {
		String username = principal.getName();
		//model.addAttribute("userId" , userService.)
		model.addAttribute("currentUser",userService.findByUsername(username));
		model.addAttribute("allQ", qService.allQuestions());
		return "home";
	}
	@RequestMapping("/registration")
	public String registerForm(@Valid @ModelAttribute("user") User user) {
		return "registrationPage";
	}
	@PostMapping("/registration")
	public String registration(@Valid @ModelAttribute("user") User user, BindingResult result,Model model,HttpSession session) {
		userValidator.validate(user,result);
		if(result.hasErrors()) {
			System.out.println(result);
			return "registrationPage";
		}
		try {	
		userService.saveWithUserRole(user);
		return "redirect:/login";
		}catch(Exception e) {
			model.addAttribute("usernameErr", "please choose a different username that username already exists");
			return "registrationPage";
		}
		
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam(value="error",required=false) String error, @RequestParam(value="logout", required=false) String logout,Model model ) {
		System.out.println("in login");
		if(error != null) {
			model.addAttribute("errorMessage", "Invalid Credentials, Please try again.");
		}
		if(logout !=null) {
			model.addAttribute("logoutMessage", "Logout Successful!");
		}
		System.out.println("in login");
		return "loginPage";
	}

}
