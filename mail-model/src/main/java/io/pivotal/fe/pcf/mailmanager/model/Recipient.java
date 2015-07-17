/**
 * 
 */
package io.pivotal.fe.pcf.mailmanager.model;

/**
 * This contains all the information for recipient of a mail message
 * @author lshannon
 *
 */
public class Recipient {
	
	private String name;
	private String email;
	private boolean subscription;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isSubscription() {
		return subscription;
	}
	public void setSubscription(boolean subscription) {
		this.subscription = subscription;
	}
	
	@Override
	public String toString() {
		return "Recipient [name=" + name + ", email=" + email
				+ ", subscription=" + subscription + "]";
	}

}
