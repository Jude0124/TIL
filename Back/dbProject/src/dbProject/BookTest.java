package dbProject;

import java.util.Scanner;

public class BookTest {
	
	public static void main(String[] args) {	
		
		BookDAO bd = new BookDAO();
		
		bd.insertBook(new BookDTO("B004", "자바스크립트", "강길동", 2020, 28000, "서울출판사"));
		bd.selectBook();
		
	}

}
