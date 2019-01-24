package com.hibernate.test;

import com.hibernate.dao.ProductDAO;
import com.hibernate.entities.Product;

public class Test {

	public static void main(String[] args) {
		ProductDAO dao = null;
		boolean flag = false;
		Product p = new Product();
		p.setProductId(1002);
		p.setProName("ScreenSet");
		p.setPrice(105.365);
		dao = new ProductDAO();
		flag = dao.insert(p);
		if (flag == true) {
			System.out.println("Inserted Successfully!");
		} else {
			System.out.println("Not Inserted!");
		}
	}

}
