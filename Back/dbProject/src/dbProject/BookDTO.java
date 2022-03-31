package dbProject;

public class BookDTO {

	private String bookNo;
	private String bookTitle;
	private String bookAuthor;
	private int bookYear;
	private int bookPrice;
	private String bookPublisher;



	public BookDTO(String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice,
			String bookPublisher) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookYear = bookYear;
		this.bookPrice = bookPrice;
		this.bookPublisher = bookPublisher;

	}


	@Override
	public String toString() {
		return bookNo + "\t" + bookTitle + "\t" + bookAuthor + "\t" + bookYear + "\t" + bookPrice + "\t"
				+ bookPublisher;
	}

	public String getBookNo() {
		return bookNo;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public int getBookYear() {
		return bookYear;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

}
