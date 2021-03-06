package com.revature.domain;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;

@Entity
@Table(name="ie_eval_comment")
public class EvalComment implements Serializable {
	
	@Id
	@Column(name="ec_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="evalCommentSeq")
	@SequenceGenerator(allocationSize=1, name="evalCommentSeq", sequenceName="eval_comment_seq")
	private Integer id;
	
	@Column(name="ec_text")
	private String commentText;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ec_eid")
	private Eval eval;
	
	public EvalComment(){}

	public EvalComment(String commentText, Eval eval) {
		super();
		this.commentText = commentText;
		this.eval = eval;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	
	@JsonIgnore
	public Eval getEval() {
		return eval;
	}

	public void setEval(Eval eval) {
		this.eval = eval;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commentText == null) ? 0 : commentText.hashCode());
//		result = prime * result + ((eval == null) ? 0 : eval.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EvalComment other = (EvalComment) obj;
		if (commentText == null) {
			if (other.commentText != null)
				return false;
		} else if (!commentText.equals(other.commentText))
			return false;
		if (eval == null) {
			if (other.eval != null)
				return false;
		} else if (!eval.equals(other.eval))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EvalComment [id=" + id + ", commentText=" + commentText + "]";
	}
}
