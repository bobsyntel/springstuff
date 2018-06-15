package com.synteloverflow.controllers;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.synteloverflow.models.Comment;

import com.synteloverflow.services.CommentService;

public class CommentController {
	
	private CommentService commentServ;
	public CommentController(CommentService commentServ) {
		
		this.commentServ = commentServ;
	}
	@RequestMapping(method=RequestMethod.POST, value="/comment/create")
	public String Create(@Valid @ModelAttribute("Cmodel") Comment comment ,BindingResult result,Model model) {
		
		if(result.hasErrors()) {
			System.out.println("in errors");
			System.out.println(result);
			return "questions/show";
		}else {
			System.out.println("in comments");
			
			commentServ.createComment(comment);
			System.out.println(comment.getId());
		//	 String qId = String.valueOf(comment.comment_type_id);
			return "redirect:/questions/";
		}
	}

}
