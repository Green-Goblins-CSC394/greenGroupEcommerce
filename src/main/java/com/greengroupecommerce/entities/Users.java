package com.greengroupecommerce.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Timestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "`Users`")
public class Users implements UserDetails {

  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "user_id")
	private UUID userID;

  @Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "created_at")
	private Timestamp createdAt;
  
	@Column(name = "last_login")
	private Timestamp lastLogin;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
  private List<Orders> orders;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
  private List<Cart> cartItems;

	public void addItemToCart(Cart cart) {
		this.cartItems.add(cart);
	}


	//UserDetails functions - required interface for session
	public String getUsername(){
		return this.email;
	}

	public boolean isEnabled(){
		return true;
	}

	public boolean isCredentialsNonExpired(){
		return true;
	}

	// Setting all users to have the "USER" role
	public Collection<? extends GrantedAuthority> getAuthorities(){
		List <GrantedAuthority> permissions = new ArrayList<GrantedAuthority>();
		if (this.isEnabled()){
			permissions.add(new SimpleGrantedAuthority("USER"));
		}
		return permissions;
	}

	public boolean isAccountNonExpired(){
		return true;
	}

	public boolean isAccountNonLocked(){
		return true;
	}

}
