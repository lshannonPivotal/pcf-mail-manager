package io.pivotal.fe.pcf.mailmanager.repositories;

import io.pivotal.fe.pcf.mailmanager.model.Recipient;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipientRepository extends JpaRepository<Recipient, String>{
	
	Recipient findByEmail(String email);

}
