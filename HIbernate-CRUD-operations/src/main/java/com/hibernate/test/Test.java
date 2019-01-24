package com.hibernate.test;

import com.hibernate.dao.ProductDAO;
import com.hibernate.dao.ProductDAOImpl;
import com.hibernate.entities.Product;

public class Test {

	public static void main(String[] args) {
		ProductDAO dao = null;
		boolean flag = false;
		Product p = new Product();
		p.setProductId(1003);
		p.setProName("Keyboard");
		p.setPrice(230.65);
		dao = new ProductDAOImpl();
		 flag = dao.saveProduct(p);
		if (flag == true) {
			System.out.println("Inserted Successfully!");
		} else {
			System.out.println("Not Inserted!");
		}
	}

}
