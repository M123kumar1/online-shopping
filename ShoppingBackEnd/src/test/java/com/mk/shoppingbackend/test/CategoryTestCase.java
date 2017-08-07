package com.mk.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mk.shoppingbackend.dao.CategoryDAO;
import com.mk.shoppingbackend.daoimpl.CategoryDAOImpl;
import com.mk.shoppingbackend.dto.Category;

public class CategoryTestCase {
	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.mk.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	/*
	 * @Test public void testAddCategory() { category = new Category();
	 * 
	 * category.setName("Mobile");
	 * category.setDescription("this is some description for television");
	 * category.setImageUrl("CAT_2.png");
	 * 
	 * assertEquals("Successfully added a new category inside the table", true,
	 * categoryDAO.add(category)); }
	 */
	/*
	 * @Test public void testGetCategory() { category = categoryDAO.get(1);
	 * assertEquals("Successfully successfully fetched from the table",
	 * "Television", category.getName()); }
	 */

	/*
	 * @Test public void testUpdateCategory() { category = categoryDAO.get(1);
	 * category.setName("TV");
	 * assertEquals("Successfully update from the table", true,
	 * categoryDAO.update(category)); }
	 */
	/*
	 * @Test public void testDeleteCategory() { category = categoryDAO.get(1);
	 * assertEquals("Successfully deleted from the table", true,
	 * categoryDAO.delete(category)); }
	 */
	/*
	 * @Test public void testListCategory() {
	 * assertEquals("Successfully fetched the lists of Category from the table",
	 * 1, categoryDAO.list().size()); }
	 */
	@Test
	public void testCURDCategory() {

		// adding the category
		category = new Category();

		category.setName("Laptop");
		category.setDescription("this is some description for Laptop");
		category.setImageUrl("CAT_.png");
		assertEquals("Successfully added a new category inside the table", true, categoryDAO.add(category));

		category = new Category();

		category.setName("Television");
		category.setDescription("this is some description for Television");
		category.setImageUrl("CAT_.png");
		assertEquals("Successfully added a new category inside the table", true, categoryDAO.add(category));

		// fetching and updating the category
		category = categoryDAO.get(2);
		category.setName("TV");
		assertEquals("Successfully update from the table", true, categoryDAO.update(category));

		// delete the category
		assertEquals("Successfully deleted from the table", true, categoryDAO.delete(category));

		// fetching the list
		assertEquals("Successfully fetched the lists of Category from the table", 1, categoryDAO.list().size());
	}
}
