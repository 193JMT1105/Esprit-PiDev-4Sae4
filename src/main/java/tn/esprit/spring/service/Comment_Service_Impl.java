package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Comment;
import tn.esprit.spring.entity.Costomer;

public interface Comment_Service_Impl {
	void addComment(Comment comment);
	void updateComment(Comment comment);
	Comment retrieveCommentById(Long idComment);
	List <Comment> retrieveAllComments();
	void deleteComment(Comment comment);

}
