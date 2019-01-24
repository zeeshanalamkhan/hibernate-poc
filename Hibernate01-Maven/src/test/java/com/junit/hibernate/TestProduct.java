package com.junit.hibernate;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hibernate.dao.ProductDAO;
import com.hibernate.entities.Product;

public class TestProduct {

	Product p = new Product();
	ProductDAO dao = new ProductDAO();

	@Before
	public void preSetUp() {

		p.setProductId(1004);
		p.setProName("Screen");
		p.setPrice(658.36);
	}

	@Test
	public void test() {
		assertEquals("Record not inserted", dao.insert(p), true);
	}

	@After
	public void free() {
		p = null;
		dao = null;
	}

}
