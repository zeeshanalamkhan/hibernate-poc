package com.hib.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hib.util.HibernateUtil;
import com.nit.entities.BookStore;

/**
 * This class is used to handle db operations of BOOK_STORE table
 * 
 * @author Ashok
 * @created 15-Jul-2018
 * @version 1.0
 * @updated
 */
public class BookStoreDao {

	private static final String FIND_BY_ISBN = "from BookStore where bookIsbn=?";
	private static final String FIND_ALL = "from BookStore";
	private static final String FIND_BY_PRICE = "from BookStore where bookPrice >=:price";
	private static final String FIND_BY_BOOK_NAMES = "from BookStore where bookName in (?,?,?)";
	private static final String FIND_BY_PRICE_RANGE = "from BookStore where bookPrice between :min and :max";
	private static final String FIND_BOOK_NAME_AND_PRICE = "select bookName,bookPrice from BookStore";
	private static final String UPDATE_ISBN_BY_BOOK_NAME = "update BookStore set bookIsbn=:isbn where bookName=:name";
	private static final String DELETE_BOOK_BY_ISBN = "delete from BookStore where bookIsbn=:isbn";
	private static final String FIND_TOTAL_RECORDS_CNT = "select count(*) from BookStore";
	private static final String FIND_UNIQUE_BOOK_NAMES = "select distinct(bookName) from BookStore";

	private static Logger logger = Logger.getLogger(BookStoreDao.class);

	/**
	 * This method used to retrieve book records using isbn
	 * 
	 * @param isbn
	 * @return BookStore
	 */
	public BookStore findByIsbn(String isbn) {
		logger.info("method execution started");
		BookStore bs = null;
		Session hs = HibernateUtil.getSf().openSession();
		Query query = hs.createQuery(FIND_BY_ISBN);

		// setting value to positional param
		query.setParameter(0, isbn);

		// executing the query
		List<BookStore> books = query.getResultList();
		if (!books.isEmpty()) {
			logger.info("method retrieved entities with size : " + books.size());
			bs = books.get(0);
		}

		// close session
		hs.close();
		logger.info("method execution completed");
		return bs;
	}

	/**
	 * This method used to retrieve all records from table
	 * 
	 * @return List<BookStore>
	 */
	public List<BookStore> findAll() {
		logger.info("method execution started");
		List<BookStore> books = null;
		Session hs = HibernateUtil.getSf().openSession();
		Query query = hs.createQuery(FIND_ALL);
		books = query.getResultList();
		if (!books.isEmpty()) {
			logger.info("method retured records size : " + books.size());
		} else {
			logger.warn("No records returned from DB");
		}
		hs.close();
		logger.info("method execution completed");

		return books;
	}

	/**
	 * This method used to retrieve books based on given price
	 * 
	 * @param price
	 * @return List<BookStore>
	 */
	public List<BookStore> findByPrice(Double price) {
		List<BookStore> books = null;
		Session hs = HibernateUtil.getSf().openSession();
		Query query = hs.createQuery(FIND_BY_PRICE);
		query.setParameter("price", price);
		books = query.getResultList();
		hs.close();
		return books;
	}

	/**
	 * This method is used to get books records based on books names
	 * 
	 * @param names
	 * @return
	 */
	public List<BookStore> findByBookNames(List<String> names) {
		List<BookStore> books = null;
		Session hs = HibernateUtil.getSf().openSession();
		Query query = hs.createQuery(FIND_BY_BOOK_NAMES);
		query.setParameter(0, names.get(0));
		query.setParameter(1, names.get(1));
		query.setParameter(2, names.get(2));
		books = query.getResultList();
		hs.close();
		return books;
	}

	/**
	 * This method is used to retrive books based on given price range
	 * 
	 * @param startPrice
	 * @param endPrice
	 * @return
	 */
	public List<BookStore> findByPriceRange(Double startPrice, Double endPrice) {
		List<BookStore> books = null;
		Session hs = HibernateUtil.getSf().openSession();
		Query query = hs.createQuery(FIND_BY_PRICE_RANGE);
		query.setParameter("min", startPrice);
		query.setParameter("max", endPrice);
		books = query.getResultList();
		hs.close();
		return books;
	}

	/**
	 * This method is used to retrieve books based on pageNumber and PageSize
	 * 
	 * @param startIndex
	 * @param pageSize
	 * @return
	 */
	public List<BookStore> findBooksWithPagination(int startIndex, int pageSize) {
		List<BookStore> books = null;
		Session hs = HibernateUtil.getSf().openSession();
		Query query = hs.createQuery(FIND_ALL);

		query.setFirstResult(startIndex);
		query.setMaxResults(pageSize);

		books = query.getResultList();

		logger.info("Retrieved records from DB : " + books.size());

		hs.close();
		return books;
	}

	/**
	 * This method is used to retrieve book names & it's pricess
	 * 
	 * @return
	 */
	public List<Object[]> findNameAndPrice() {
		List<Object[]> namesAndPrices = null;
		Session hs = HibernateUtil.getSf().openSession();
		Query query = hs.createQuery(FIND_BOOK_NAME_AND_PRICE);
		namesAndPrices = query.getResultList();
		hs.close();
		return namesAndPrices;
	}

	/**
	 * This method is used update isbn using name
	 * 
	 * @param name
	 * @param isbn
	 * @return boolean
	 */
	public boolean updateIsbnByName(String name, String isbn) {
		Session hs = HibernateUtil.getSf().openSession();
		Transaction tx = hs.beginTransaction();

		Query query = hs.createQuery(UPDATE_ISBN_BY_BOOK_NAME);
		query.setParameter("name", name);
		query.setParameter("isbn", isbn);

		int cnt = query.executeUpdate();

		tx.commit();
		hs.close();

		return (cnt > 0 ? true : false);
	}

	/**
	 * This method is used to delete book by isbn value
	 * 
	 * @param isbn
	 * @return boolean
	 */
	public boolean deleteByIsbn(String isbn) {
		Session hs = HibernateUtil.getSf().openSession();
		Transaction tx = hs.beginTransaction();

		Query query = hs.createQuery(DELETE_BOOK_BY_ISBN);
		query.setParameter("isbn", isbn);
		int cnt = query.executeUpdate();

		tx.commit();
		hs.close();
		return (cnt > 0 ? true : false);
	}

	/**
	 * This method is used to find total records count
	 * 
	 * @return
	 */
	public Long findTotalRecordsCnt() {
		Session hs = HibernateUtil.getSf().openSession();
		Query query = hs.createQuery(FIND_TOTAL_RECORDS_CNT);
		List<Long> result = query.getResultList();
		hs.close();
		return result.get(0);
	}

	/**
	 * This method will return unique book names from tbl
	 * 
	 * @return List<String>
	 */
	public List<String> findUniqueBookNames() {
		Session hs = HibernateUtil.getSf().openSession();
		Query query = hs.createQuery(FIND_UNIQUE_BOOK_NAMES);
		List<String> names = query.getResultList();
		hs.close();
		return names;
	}

	/**
	 * This method is used to retrieve all books using named query
	 * 
	 * @return List<BookStore>
	 */
	public List<BookStore> findAllBooksWithNamedQuery() {
		List<BookStore> books = null;
		Session hs = HibernateUtil.getSf().openSession();
		Query query = hs.getNamedQuery("FIND_ALL_BOOKS");
		books = query.getResultList();
		hs.close();
		return books;
	}
}
