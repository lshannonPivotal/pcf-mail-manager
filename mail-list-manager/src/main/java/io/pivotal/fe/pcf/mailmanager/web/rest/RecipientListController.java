/**
 * 
 */
package io.pivotal.fe.pcf.mailmanager.web.rest;

import io.pivotal.fe.pcf.mailmanager.model.Recipient;
import io.pivotal.fe.pcf.mailmanager.model.RecipientList;
import io.pivotal.fe.pcf.mailmanager.repositories.RecipientListRepository;
import io.pivotal.fe.pcf.mailmanager.repositories.RecipientRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * @author lshannon
 *
 */
@RestController
@RequestMapping(value="/api/v1")
@Api(value="/recipientList",description="CRUD Operations For List of Recipients")
public class RecipientListController {
	
	@Autowired
	private RecipientListRepository recipientListRepository;
	
	@Autowired
	private RecipientRepository recipientRepository;
	
	@RequestMapping(value="/recipientList")
	@ApiOperation(value="Get all the lists")
	//TODO Move this into a proper test case
	public List<RecipientList> getRecipients() {
		
		Recipient test = new Recipient();
		test.setEmail("werwer");
		test.setName("Luke");
		test.setSubscription(true);
		recipientRepository.save(test);
		
		List<Recipient> recipientsInList = new ArrayList<Recipient>();
		recipientsInList.add(test);
		
		RecipientList list = new RecipientList();
		list.setName("Test List");
		list.setRecipients(recipientsInList);
		
				
		recipientListRepository.save(list);
		
		return recipientListRepository.findAll();
	}
	
	@RequestMapping(value="/recipientLists/{name}")
	@ApiOperation(value="Get a specific list of list by name",response=RecipientList.class)
	public List<RecipientList> getRecipientListByName(@PathVariable String name) {
		List<RecipientList> list = recipientListRepository.findByName(name);
		System.out.println("Found a list:" + list + " for name: " + name);
		return list;
	}

}
