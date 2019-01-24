package com.nit.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQuery(
		name = "FIND_ALL_BOOKS", 
		query = "from BookStore"
)
@Entity
@Table(name = "BOOK_STORE")
public class BookStore {

	@Id
	@GeneratedValue
	@Column(name = "BOOK_ID")
	private Integer bookId;

	@Column(name = "BOOK_NAME")
	private String bookName;

	@Column(name = "AUTHOR_NAME")
	private String authorName;

	@Column(name = "BOOK_ISBN")
	private String bookIsbn;

	@Column(name = "BOOK_PRICE")
	private Double bookPrice;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getBookIsbn() {
		return bookIsbn;
	}

	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "BookStore [bookId=" + bookId + ", bookName=" + bookName
				+ ", authorName=" + authorName + ", bookIsbn=" + bookIsbn
				+ ", bookPrice=" + bookPrice + "]";
	}

}
