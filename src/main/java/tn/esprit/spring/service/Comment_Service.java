package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Comment;
import tn.esprit.spring.repository.CommentRepositiry;
@Service
public class Comment_Service implements Comment_Service_Impl {
	@Autowired
	CommentRepositiry cmntrep;

	@Override
	public void addComment(Comment comment) {
		// TODO Auto-generated method stub
		cmntrep.save(comment);
		
		
	}

	@Override
	public void updateComment(Comment comment) {
		// TODO Auto-generated method stub
		cmntrep.save(comment);
		
	}

	@Override
	public Comment retrieveCommentById(Long idComment) {
		// TODO Auto-generated method stub
		return cmntrep.findById(idComment).get();
	}

	@Override
	public List<Comment> retrieveAllComments() {
		// TODO Auto-generated method stub
		return (List<Comment>)cmntrep.findAll();
	}

	@Override
	public void deleteComment(Comment comment) {
		// TODO Auto-generated method stub
		cmntrep.delete(comment);
		
	}
 
}
