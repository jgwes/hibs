package edu.vt.jgwes.dao.hibernate;


import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table( name = "MESSAGE" )
public class Message {
	private Long id;
	
	private String content;
	
	public Message() {
		// this form used by Hibernate
	}
	
	public Message(String content){
		this.content = content;
	}
	
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	public Long getId() {
	    return id;
	}
	
	private void setId(Long id) {
		this.id = id;
    }
	
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
}
