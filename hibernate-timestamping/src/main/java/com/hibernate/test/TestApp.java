package com.hibernate.test;

import java.util.Date;

import com.hibernate.dao.CarDAO;
import com.hibernate.entity.Car;

public class TestApp {

	public static void main(String[] args) {
		Car c = new Car();
		CarDAO dao = new CarDAO();
		boolean flag = false;
		c.setCarId(22);
		c.setCarColor("PINK");
		c.setCarName("MARUTI 800");
		c.setMfgDate(new Date());
		// flag = dao.insert(c);
		flag = dao.updateCar(c);
		System.out.println("Status: " + flag);

	}
}
