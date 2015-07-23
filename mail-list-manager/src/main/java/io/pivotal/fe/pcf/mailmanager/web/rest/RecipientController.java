package io.pivotal.fe.pcf.mailmanager.web.rest;

import io.pivotal.fe.pcf.mailmanager.model.Recipient;
import io.pivotal.fe.pcf.mailmanager.repositories.RecipientRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api/v1")
@Api(value="/recipient",description="CRUD Operations For Recipients")
public class RecipientController {

	@Autowired
	private RecipientRepository recipientRepository;
	
	@RequestMapping(value="/recipients")
	@ApiOperation(value="Get a list of all recipients")
	//TODO Move this into a proper test case
	public List<Recipient> getRecipients() {
		
		Recipient test = new Recipient();
		test.setEmail("werwer");
		test.setName("Luke");
		test.setSubscription(true);
				
		recipientRepository.save(test);
		
		return recipientRepository.findAll();
	}
	
	@RequestMapping(value="/recipients/{email}")
	@ApiOperation(value="Get a specific recipient by email",response=Recipient.class)
	public Recipient getRecipientByEmail(@PathVariable String email) {
		Recipient r = recipientRepository.findByEmail(email);
		System.out.println("Found:" + r + " for email: " + email);
		return r;
	}
}
