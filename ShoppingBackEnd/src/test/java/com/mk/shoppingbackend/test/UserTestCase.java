package com.mk.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mk.shoppingbackend.dao.UserDAO;
import com.mk.shoppingbackend.dto.Address;
import com.mk.shoppingbackend.dto.Cart;
import com.mk.shoppingbackend.dto.User;

public class UserTestCase {
	private static AnnotationConfigApplicationContext context;
	private static UserDAO userDAO;
	private User user;
	private Cart cart;
	private Address address;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.mk.shoppingbackend");
		context.refresh();
		userDAO = (UserDAO) context.getBean("userDAO");
	}
	/*
	 * @Test public void testAdd(){ user=new User(); user.setFirstName("Mintu");
	 * user.setLastName("Kumar"); user.setEmail("mkumar@gmail.com");
	 * user.setContactNumber("9798733506"); user.setRole("USER");
	 * user.setPassword("mkumar9798");
	 * 
	 * //add user assertEquals("Failed to add user!",
	 * true,userDAO.addUser(user));
	 * 
	 * address=new Address();
	 * address.setAddressLineOne("101/B B.K.Gudda Park,SR Nagar");
	 * address.setAddressLineTwo("Near Ellamma Temple");
	 * address.setCity("Hyderabad"); address.setState("Telangana");
	 * address.setCountry("India"); address.setPostalCode("500016");
	 * address.setBilling(true);
	 * 
	 * //link the user with the address using user id
	 * address.setUserId(user.getId());
	 * 
	 * //add the address assertEquals("Failed to add addres!",
	 * true,userDAO.addAddress(address));
	 * 
	 * if(user.getRole().equals("USER")){ //create a cart for this user cart=new
	 * Cart(); cart.setUser(user);
	 * 
	 * //add the cart assertEquals("Failed to add cart!",
	 * true,userDAO.addCart(cart));
	 * 
	 * //add shipping address for this user address=new Address();
	 * address.setAddressLineOne("101/B B.K.Gudda Park,SR Nagar");
	 * address.setAddressLineTwo("Near Ellamma Temple");
	 * address.setCity("Hyderabad"); address.setState("Telangana");
	 * address.setCountry("India"); address.setPostalCode("500016"); //set
	 * shipping to true address.setBilling(true);
	 * 
	 * //link it with the user assertEquals("Failed to add shipping address!",
	 * true,userDAO.addAddress(address));
	 * 
	 * } }
	 */

	/*
	 * @Test public void testAdd() { user = new User();
	 * user.setFirstName("Mintu"); user.setLastName("Kumar");
	 * user.setEmail("mkumar@gmail.com"); user.setContactNumber("9798733506");
	 * user.setRole("USER"); user.setPassword("mkumar9798");
	 * 
	 * 
	 * 
	 * if (user.getRole().equals("USER")) { // create a cart for this user cart
	 * = new Cart();
	 * 
	 * cart.setUser(user);
	 * 
	 * //attach cart cart with the user user.setCart(cart);
	 * 
	 * } // add user assertEquals("Failed to add user!", true,
	 * userDAO.addUser(user));
	 * 
	 * }
	 */

	/*
	 * @Test public void testUpdateCart(){ //fetch the user by its email
	 * user=userDAO.getByEmail("mkumar@gmail.com");
	 * 
	 * //get the cart of the user cart=user.getCart();
	 * 
	 * cart.setGrandTotal(2222); cart.setCartLines(2);
	 * assertEquals("Failed to add user!", true, userDAO.updateCart(cart)); }
	 */

	/*@Test
	public void testAddAddress() {
		// we need to add an user
		user = new User();
		user.setFirstName("Mintu");
		user.setLastName("Kumar");
		user.setEmail("mkumar@gmail.com");
		user.setContactNumber("9798733506");
		user.setRole("USER");
		user.setPassword("mkumar9798");

		// add user
		assertEquals("Failed to add user!", true, userDAO.addUser(user));

		// we are going to add the address
		address = new Address();
		address.setAddressLineOne("101/B B.K.Gudda Park,SR Nagar");
		address.setAddressLineTwo("Near Ellamma Temple");
		address.setCity("Hyderabad");
		address.setState("Telangana");
		address.setCountry("India");
		address.setPostalCode("500016");
		address.setBilling(true);

		// attach the user to the address
		address.setUser(user);
		assertEquals("Failed to add user!", true, userDAO.addAddress(address));

		// we are also going the shipping address
		address = new Address();
		address.setAddressLineOne("101/B B.K.Gudda Park,SR Nagar");
		address.setAddressLineTwo("Near Ellamma Temple");
		address.setCity("Hyderabad");
		address.setState("Telangana");
		address.setCountry("India");
		address.setPostalCode("500016");
		// set shipping to true
		address.setShipping(true);
		
		address.setUser(user);
		assertEquals("Failed to add billing address!", true, userDAO.addAddress(address));

	}*/
	/*@Test
	public void testAddAddress(){
		user= userDAO.getByEmail("mkumar@gmail.com");
		
		address = new Address();
		address.setAddressLineOne("102/B B.K.Gudda Park,SR Nagar");
		address.setAddressLineTwo("Near BCCL Office");
		address.setCity("Dhanbad");
		address.setState("Jharkhand");
		address.setCountry("India");
		address.setPostalCode("500016");
		// set shipping to true
		address.setShipping(true);
		
		address.setUser(user);
		assertEquals("Failed to add shipping address!", true, userDAO.addAddress(address));

	}*/
	@Test
	public void testGetAddresses(){
		user=userDAO.getByEmail("mkumar@gmail.com");
		
		assertEquals("Failed to fetch the list of address and size does not match!", 2, userDAO.listShippingAddresses(user).size());
		
		assertEquals("Failed to fetch the billing address and size does not match!", "Hyderabad", userDAO.getBillingAddress(user).getCity());
		
	}
}
