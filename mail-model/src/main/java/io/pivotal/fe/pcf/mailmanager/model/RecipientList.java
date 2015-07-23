/**
 * 
 */
package io.pivotal.fe.pcf.mailmanager.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * This contains all the information for recipient of a mail message
 * @author lshannon
 *
 */
@Entity
@Table(name="recipient_list")
public class RecipientList implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany
	private List<Recipient> recipients;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Recipient> getRecipients() {
		return recipients;
	}

	public void setRecipients(List<Recipient> recipients) {
		this.recipients = recipients;
	}

	@Override
	public String toString() {
		return "RecipientList [id=" + id + ", name=" + name + ", recipients="
				+ recipients + "]";
	}

}
