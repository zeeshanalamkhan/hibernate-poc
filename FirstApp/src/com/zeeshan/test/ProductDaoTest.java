package com.zeeshan.test;
import com.zeeshan.dao.ProductDao;
import com.zeeshan.entities.*;

public class ProductDaoTest {
	public static void main(String[] args) {
		Product entity = new Product();
		entity.setProductId(1001);
		entity.setProName("Mouse");
		entity.setPrice(5000.256);
		ProductDao dao = new ProductDao();
		boolean isInserted = dao.insert(entity);
		System.out.println("Record Inserted " +isInserted);
	}
}
