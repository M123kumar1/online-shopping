package com.mk.dao;

import java.util.List;

import com.mk.dto.Category;

public interface CategoryDAO {
	List<Category> list();
	Category get(int id);
}
