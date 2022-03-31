package book;

public class Book {
	private String bookName;
	private int price;
	private double bookDiscountRate;
	
	
	
	public Book() {
		super();
	}
	

	public Book(String bookName, int price, double bookDiscountRate) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.bookDiscountRate = bookDiscountRate;
	}


	public double getDiscountBookPrice() {
		return this.price / 100 * (100-bookDiscountRate);
		
	}

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getBookDiscountRate() {
		return bookDiscountRate;
	}
	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}


	public String toString() {
		return "" + bookName + "\t" + price + "원\t" + bookDiscountRate + "%\t" + getDiscountBookPrice() +"원\t";
	}
	
	
	
}
