package br.com.donateEducation.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.donateEducation.entities.Person;
import br.com.donateEducation.services.PersonService;

public class PersonServiceImpl implements PersonService{

	private static final Logger log = LoggerFactory.getLogger(PersonServiceImpl.class);
	
	@Override
	public Person persitirFunc(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Person> buscarPorCpf(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Person> buscarPorEmail(String email) {
		log.info("Find employee by email {}", email);
		return Optional.ofNullable(null);
	}

	@Override
	public Optional<Person> buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
