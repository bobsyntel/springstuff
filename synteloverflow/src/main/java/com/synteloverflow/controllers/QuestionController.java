package com.synteloverflow.controllers;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomCollectionEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.synteloverflow.models.Answer;
import com.synteloverflow.models.Comment;
import com.synteloverflow.models.Question;
import com.synteloverflow.models.Tag;
import com.synteloverflow.services.QuestionService;
import com.synteloverflow.services.TagService;
import com.synteloverflow.services.UserService;

@Controller
public class QuestionController {
	@Autowired
	private QuestionService qService;
	@Autowired
	private TagService tagServ;
	
//	public QuestionController(QuestionService qService,TagService tagServ) {
	//	this.qService = qService;
		//this.tagServ = tagServ;
	//}
	 @InitBinder
	    public void initBinder(WebDataBinder binder) {
	    	binder.registerCustomEditor(List.class, "tags", new CustomCollectionEditor(List.class) {
	    		public void setAsText(String element) {
	    			System.out.println("parse string");
	    			String[] listOfTags = element.split(",");
	    			List<Tag> TagList = new ArrayList<Tag>();
	    			/*
	    			int maxLength ;
	    			if(listOfTags.length > 2) {
	    				maxLength = 3;
	    			}else {
	    				maxLength = listOfTags.length;
	    			}
	    			
	    			for(int i = 0; i < maxLength; i++) {
	    				TagList.add(tagServ.findOrCreateTag(listOfTags[i]));
	    				
	    			}
	    			*/
	    			int maxLength = listOfTags.length > 2 ? 3 : listOfTags.length;
	    			System.out.println(listOfTags[0]);
	    			for(int i = 0; i < maxLength; i++) {
	    				System.out.println(listOfTags[i]);
	    				TagList.add(tagServ.findOrCreateTag(listOfTags[i]));
	    				
	    				
	    			}
	    			
	    			setValue(TagList);
	    			
	    		}
	    		
	    	});
	    }

	
	
	    	
	@RequestMapping("/questions/new/{id}")
	public String newQuestion(@PathVariable("id") Long id,@ModelAttribute("newQuestion") Question question,Principal principal,Model model) {
		String user =  principal.getName();
		System.out.println("in question "+user);
		model.addAttribute("user", user);
		model.addAttribute("userId", id);
		model.addAttribute("allQ", qService.allQuestions());
		return "questions/newQuestion";
	}
	
	@PostMapping("/new")
	public String createQuestion(@Valid @ModelAttribute("newQuestion") Question question,BindingResult result, Model model,@RequestParam("tags") String tags) {
		if(result.hasErrors()) {
			System.out.println(result);
			System.out.println("errors abound");
			return "questions/newQuestion";
		}else {
	        qService.addQuestion(question);
	       
	        question.getId();
	        System.out.println("No errors");
	        System.out.println(tags);
	        String qId = String.valueOf(question.getId());
	        return "redirect:/questions/".concat(qId);
		}
		
	}
	@RequestMapping("/questions/{id}")
	public String Show(@PathVariable("id") Long id,Model model,@ModelAttribute("Amodel") Answer answer) {
		model.addAttribute("question", qService.getQuestion(id));
		Question q = qService.getQuestion(id);
		q.getTags();
		for(Tag tag : q.getTags()) {
			System.out.println(tag.getSubject());
		}
		model.addAttribute("userId", qService.getQuestion(id).getUser());
		return "questions/show";
	}
	

}
