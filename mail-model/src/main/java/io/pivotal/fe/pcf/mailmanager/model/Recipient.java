/**
 * 
 */
package io.pivotal.fe.pcf.mailmanager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This contains all the information for recipient of a mail message
 * @author lshannon
 *
 */
@Entity
@Table(name="recipient")
public class Recipient implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="name")
	private String name;
		
	@Column(name="subscription")
	private boolean subscription = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSubscription() {
		return subscription;
	}

	public void setSubscription(boolean subscription) {
		this.subscription = subscription;
	}

	@Override
	public String toString() {
		return "Recipient [id=" + id + ", email=" + email + ", name=" + name
				+ ", subscription=" + subscription + "]";
	}
	
	

}
