package tn.esprit.spring.restController;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Bank;
import tn.esprit.spring.entity.Comment;
import tn.esprit.spring.service.Comment_Service;

@RestController
@RequestMapping("/comment")
public class CommentRestController {
	@Autowired
	Comment_Service cmntser;
	
	
	@PostMapping("/addcomment")
	public void addComment(@RequestBody  Comment cmnt)
	{
		cmntser.addComment(cmnt);	
	}
	@GetMapping("/retrieveAllcomments")
	public List<Comment> retrieveAllComment()
	{
		return cmntser.retrieveAllComments();
	}

	@PutMapping("/updatecomment")
	public void updateUser(@RequestBody  Comment cmnt)
	{
		cmntser.updateComment(cmnt);
	}
	@GetMapping("/retrievecommentById/{id}")
	public void retrieveCommentById(@PathParam("id") Long id)
	{
		cmntser.retrieveCommentById(id);
	}
	@DeleteMapping("/deletecomment")
	public void deleteComment(@RequestBody Comment cmnt)
	{
		cmntser.deleteComment(cmnt); 
	}

}
