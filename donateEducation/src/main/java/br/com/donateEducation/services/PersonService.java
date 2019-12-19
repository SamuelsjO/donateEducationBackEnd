package br.com.donateEducation.services;

import java.util.Optional;

import br.com.donateEducation.entities.Person;


public interface PersonService {

	/**
	 * Persisting one employee in the data base
	 * 
	 * @param funcionario
	 * @return Funcionario
	 */
	Person persitirFunc(Person person);
	
	/**
	 * Search and return on employee given CPF
	 * 
	 * @param cpf
	 * @return Optional<Funcionario>
	 */
	Optional<Person> buscarPorCpf(String cpf);
	
	/**
	 * Search and return one employee given a email.
	 * 
	 * @param email
	 * @return Optional<Funcionario>
	 */
	Optional<Person> buscarPorEmail(String email);
	
	/**
	 * Search and return a employee by ID.
	 * 
	 * @param id
	 * @return Optional<Funcionario>
	 */
	Optional<Person> buscarPorId(Long id);

}
