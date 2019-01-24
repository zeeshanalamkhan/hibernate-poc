package com.custom.test;

import com.custom.dao.OrderDao;
import com.custom.entities.Order;
public class CustomGeneratorTest {
	
	public static void main(String[] args) {
		boolean isInserted;
		Order od  =new Order();
		od.setOrderId("1005");
		od.setOrderBy("MD SHADAB");
		od.setOrderPrice(4565.3652);
		OrderDao dao = new OrderDao();
		 isInserted = dao.insert(od);
		System.out.println("is Record Inserted Successfully!?: "+isInserted);
	}
}
