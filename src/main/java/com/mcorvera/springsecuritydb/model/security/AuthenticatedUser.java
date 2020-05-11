package com.mcorvera.springsecuritydb.model.security;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class AuthenticatedUser implements UserDetails {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7478279946802298801L;


	private Long id;
	
	
	private String email;

	private String name;
	
	private String username;

	private String password;
	
	private Collection<? extends GrantedAuthority> authorities;
	
	private Boolean isAccountNonExpired;
	
	private Boolean isAccountNonLocked;

	private Boolean isCredentialsNonExpired;
	
	private Boolean isEnabled;

	public AuthenticatedUser(Long id, String email, String name, String username, String password,
			Collection<? extends GrantedAuthority> authorities, Boolean isAccountNonExpired, Boolean isAccountNonLocked,
			Boolean isCredentialsNonExpired, Boolean isEnabled) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.username = username;
		this.password = password;
		this.authorities = authorities;
		this.isAccountNonExpired = isAccountNonExpired;
		this.isAccountNonLocked = isAccountNonLocked;
		this.isCredentialsNonExpired = isCredentialsNonExpired;
		this.isEnabled = isEnabled;
	}

	public Long getId() {
		return id;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return isAccountNonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return isAccountNonLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return isCredentialsNonExpired;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return isEnabled;
	}

}
