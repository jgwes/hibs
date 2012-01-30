package edu.vt.jgwes.dao.hibernate;


import java.util.Date;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table( name = "MESSAGE" )
public class Message {
	private Long id;
	private String content;
	private Date date;
	
	public Message() {
		
	}
	
	public Message(String content, Date date){
		this.content = content;
		this.date = date;
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
	
	public String getContent(){
		return content;
	}
	
	private void setContent(String content){
		this.content = content;
	}
	
	// Dates need special handling
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MESSAGE_DATE") 
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date){
		this.date = date;
	}
}
