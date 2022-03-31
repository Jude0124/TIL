package book;

public class BookTest {

	public static void main(String[] args) {
		System.out.println("책이름\t\t가격\t할인율\t할인후가격");
		System.out.println("----------------------------------------");
		Book book1 = new Book("SQL Plus", 50000, 5.0);
		System.out.println(book1.toString());
		
		Book book2 = new Book("Java 2.0", 40000, 3.0);
		System.out.println(book2.toString());
		
		Book book3 = new Book("JSP Servlet", 60000, 6.0);
		System.out.println(book3.toString());
	}

}
