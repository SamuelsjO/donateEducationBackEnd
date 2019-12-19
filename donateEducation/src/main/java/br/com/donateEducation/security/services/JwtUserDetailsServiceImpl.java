package br.com.donateEducation.security.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.donateEducation.entities.Person;
import br.com.donateEducation.security.JwtUserFactory;
import br.com.donateEducation.services.PersonService;


@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private PersonService personService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Person> person = personService.buscarPorEmail(username);

		if (person.isPresent()) {
			return JwtUserFactory.create(person.get());
		}

		throw new UsernameNotFoundException("Email not found.");
	}

}
