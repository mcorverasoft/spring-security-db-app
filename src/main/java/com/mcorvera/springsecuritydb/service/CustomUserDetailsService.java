package com.mcorvera.springsecuritydb.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mcorvera.springsecuritydb.model.User;
import com.mcorvera.springsecuritydb.model.security.AuthenticatedUser;
import com.mcorvera.springsecuritydb.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	


	@Override
	public UserDetails loadUserByUsername(String emailOrUsername) throws UsernameNotFoundException {
		User user =  this.userRepository.findByEmailOrUsername(emailOrUsername,emailOrUsername)
								.orElseThrow(()->new UsernameNotFoundException("This e-mail is not registered"));
		
		/*Add Roles with .forEach
		 * List<GrantedAuthority> authorities =new ArrayList<>();	 	
		user.getRoles().forEach(role-> autoauthorities.add(new SimpleGrantedAuthority(role.getName().name())));
		*/
		
		
		/*
		 * Add Roles with stream().map(role->to do)
		 * */
		List<GrantedAuthority> autoauthorities = user.getRoles().stream().map(
					role->new SimpleGrantedAuthority(role.getName().name())
				).collect(Collectors.toList());
		
		
		UserDetails userAuthenticated= new AuthenticatedUser(user.getId(), user.getEmail(), user.getEmail(), user.getUsername(), user.getPassword(),
				autoauthorities , user.getIsaccountnonexpired(), user.getIsaccountnonexpired(), user.getIsaccountnonexpired(), user.getIsenabled() )	;
		return userAuthenticated;
	}

}
