package com.synteloverflow.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.synteloverflow.models.Comment;
import com.synteloverflow.repositories.CommentRepository;

@Service
public class CommentService {
	
	 private  CommentRepository commentRepo;
		public CommentService(CommentRepository commentRepo) {
			this.commentRepo = commentRepo;
		}
		
		public void createComment(Comment comment) {
			commentRepo.save(comment);
		}
		
		public List<Comment> allComments(){
			return commentRepo.findAll();
		}

}
