package tn.esprit.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_Comment")
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Comment_Id")
private Long commentId;
	@Column(name = "Author_Id")
private Long authorId;
	@Column(name = "Comment_value")
private String value ;
	@Column(name = "Like_Count")
private int like;
}
