package com.greengroupecommerce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greengroupecommerce.entities.Users;
import com.greengroupecommerce.repositories.UsersRepository;

public class CustomerUserDetails implements UserDetailsService {

  @Autowired
  private UsersRepository usersRepository;

  public UserDetails loadUserByUsername(String email) {
        Users user = this.usersRepository.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException(email, null);
        }
        return user;
    }

}
