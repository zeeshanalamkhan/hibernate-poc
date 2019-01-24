package com.hibernate.dao;

import com.hibernate.entities.Product;

public interface ProductDAO {

	public boolean saveProduct(Product p);
	public void persistProduct(Product p);
	public Product loadProduct(Class clazz, int id);
}
