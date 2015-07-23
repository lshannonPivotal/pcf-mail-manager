package io.pivotal.fe.pcf.mailmanager.repositories;

import io.pivotal.fe.pcf.mailmanager.model.RecipientList;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipientListRepository extends JpaRepository<RecipientList, String>{
	
	List<RecipientList> findByName(String name);

}
