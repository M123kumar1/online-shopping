package com.mk.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mk.shoppingbackend.dao.CategoryDAO;
import com.mk.shoppingbackend.dao.ProductDAO;
import com.mk.shoppingbackend.dto.Category;
import com.mk.shoppingbackend.dto.Product;

public class ProductTestCase {
	private static AnnotationConfigApplicationContext context;

	private static ProductDAO productDAO;

	private Product product;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.mk.shoppingbackend");
		context.refresh();
		productDAO = (ProductDAO) context.getBean("productDAO");
	}

	/*@Test
	public void testCURDCategory() {

		// adding the category
		product = new Product();

		product.setName("Oppo selfie S53");
		product.setBrand("Oppo");
		product.setDescription("this is some description for Oppo Mobile phone");
		product.setUnitPrice(25000);
		product.setActive(true);
		product.setCategory(3);
		product.setSuplier(3);
		assertEquals("Successfully went wrong while inserting a new product", true, productDAO.add(product));
		
		product=productDAO.get(2);
		product.setName("Samsung Galaxy S7");
		assertEquals("Successfully went wrong while updating the existing record!", true,productDAO.update(product));
		
		assertEquals("Successfully went wrong while deleting the existing record!", true,productDAO.delete(product));
		
		assertEquals("Successfully went wrong while fetching the list of products!", 6,productDAO.list().size());
	}*/
	
	@Test
	public void testListActiveProducts() {
		assertEquals("Successfully went wrong while fetching the list of products!", 5,productDAO.listActiveProducts().size());
	}
	

	@Test
	public void testListActiveProductsBycategory() {
		assertEquals("Successfully went wrong while fetching the list of products!", 4,productDAO.listActiveProductsByCategory(3).size());
		assertEquals("Successfully went wrong while fetching the list of products!", 1,productDAO.listActiveProductsByCategory(1).size());
	}
	@Test
	public void testGetLatestActiveProducts() {
		assertEquals("Successfully went wrong while fetching the list of products!", 3,productDAO.getLatestActiveProducts(3).size());
	}
}
