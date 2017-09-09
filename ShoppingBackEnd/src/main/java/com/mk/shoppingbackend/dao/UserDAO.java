package com.mk.shoppingbackend.dao;

import java.util.List;

import com.mk.shoppingbackend.dto.Address;
import com.mk.shoppingbackend.dto.Cart;
import com.mk.shoppingbackend.dto.User;

public interface UserDAO {
	//add an user
	boolean addUser(User user);
	User getByEmail(String email);
	
	//add an address
	boolean addAddress(Address address);
	
	//alternative
	//Address getBillingAddress(User userId);
	//List<Address> listShippingAddresses(User userId);
	
	Address getBillingAddress(User user);
	List<Address> listShippingAddresses(User user);
	
	
}
