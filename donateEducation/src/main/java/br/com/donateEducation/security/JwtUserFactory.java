package br.com.donateEducation.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import br.com.donateEducation.entities.Person;
import br.com.donateEducation.enums.PerfilEnum;


public class JwtUserFactory {

	private JwtUserFactory() {
	}

	/**
	 * Converters and generates a JwtUser with data base of an employee.
	 * 
	 * @param funcionario
	 * @return JwtUser
	 */
	public static JwtUser create(Person person) {
		return new JwtUser(person.getId(), person.getEmail(), person.getSenha(), 
				mapToGrantedAuthorities(person.getPerfil()));
	}

	/**
	 * Converters the profile of user for a format used by Spring Security.
	 * 
	 * @param perfilEnum
	 * @return List<GrantedAuthority>
	 */
	private static List<GrantedAuthority> mapToGrantedAuthorities(PerfilEnum perfilEnum) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(perfilEnum.toString()));
		return authorities;
	}

}
