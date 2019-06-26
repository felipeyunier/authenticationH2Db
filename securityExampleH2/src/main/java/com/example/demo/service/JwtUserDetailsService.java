package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.daoImpl.UserDBRepositoryImpl;
import com.example.demo.db.UserDB;

@Component
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserDBRepositoryImpl userDBRepositoryImpl; 
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<UserDB> userOpt = userDBRepositoryImpl.findByUsername(username);
		return userOpt.get();
	}

}
