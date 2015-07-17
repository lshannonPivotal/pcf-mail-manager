/**
 * 
 */
package io.pivotal.fe.pcf.mailmanager.model;

import java.util.Date;

/**
 * This represents a message that is sent out to recipients
 * @author lshannon
 *
 */
public class Message {
	
	private Integer id;
	private String message;
	private Date dateCreated;
	private Date dateSent;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateSent() {
		return dateSent;
	}
	public void setDateSent(Date dateSent) {
		this.dateSent = dateSent;
	}
	
	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + ", dateCreated="
				+ dateCreated + ", dateSent=" + dateSent + "]";
	}

}
