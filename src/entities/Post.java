package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private String context;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();
	
	public Post() {
	}
	public Post(Date moment, String title, String context, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.context = context;
		this.likes = likes;
	}
	
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public Integer getLike() {
		return likes;
	}
	public void setLike(Integer like) {
		this.likes = like;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void addComments(Comment comment) {
		comments.add(comment);
	}
	public void removeComments(Comment comment) {
		comments.remove(comment);
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(context + "\n");
		sb.append("Comments:\n");
		for(Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
}
