package javaProject2;

public class Book {

	int bookPrice, bookYear;
	String bookNo, bookTitle, bookAuthor, bookPublisher;

	public Book(String bookNo, String bookTitle, String bookAuthor, int bookPrice, int bookYear, String bookPublisher) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookYear = bookYear;
		this.bookPublisher = bookPublisher;
	}

	@Override
	public String toString() {
		return bookNo + "\t" + bookTitle + "\t" + bookAuthor + "\t" + bookPrice + "\t" + bookYear + "\t"
				+ bookPublisher;
	}

}
