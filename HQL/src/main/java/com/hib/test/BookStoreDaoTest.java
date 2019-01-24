package com.hib.test;

import java.util.ArrayList;
import java.util.List;

import com.hib.dao.BookStoreDao;
import com.hib.util.HibernateUtil;
import com.nit.entities.BookStore;

public class BookStoreDaoTest {

	public static void main(String[] args) {
		BookStoreDao dao = new BookStoreDao();
		BookStore book = dao.findByIsbn("ISBN001");
		// System.out.println(book);

		// List<BookStore> books = dao.findAll();

		// List<BookStore> books = dao.findByPrice(500.00);

		List<String> names = new ArrayList<String>();
		names.add("Spring");
		names.add("WebServices");
		names.add("HIBERNATE");

		// List<BookStore> books = dao.findByBookNames(names);

		// List<BookStore> books = dao.findByPriceRange(500.00, 600.00);

		/*
		 * List<BookStore> books = dao.findBooksWithPagination(2, 10);
		 * 
		 * if (!books.isEmpty()) { for (BookStore bs : books) {
		 * System.out.println(bs); } }
		 */

		/*
		 * List<Object[]> objArrList = dao.findNameAndPrice();
		 * 
		 * if(!objArrList.isEmpty()){ for(Object[] objArr : objArrList){
		 * System.out.println(objArr[0]+"--"+objArr[1]); } }
		 */

		/*
		 * boolean isUpdated = dao.updateIsbnByName("HIBERNATE","ISBN002");
		 * System.out.println("Record updated ?: "+isUpdated);
		 */

		/*
		 * boolean isDeleted = dao.deleteByIsbn("ISBN005");
		 * System.out.println("Record deleted ? : "+isDeleted);
		 */

		/*
		 * long num = dao.findTotalRecordsCnt();
		 * System.out.println("Total Records in TBL : "+num);
		 */

		/*
		 * List<String> bookNames = dao.findUniqueBookNames(); if
		 * (!names.isEmpty()) { for (String name : bookNames) {
		 * System.out.println(name); } }
		 */

		List<BookStore> books = dao.findAllBooksWithNamedQuery();

		if (!books.isEmpty()) {
			for (BookStore bs : books) {
				System.out.println(bs);
			}
		}

		HibernateUtil.closeSf();

	}

}
