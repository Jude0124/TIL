package array;

public class DeepCopy {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥1", "조정래");
		bookArray1[1] = new Book("태백산맥2", "조정래");
		bookArray1[2] = new Book("태백산맥3", "조정래");
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		for (int i = 0 ; i < bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("=== bookArray1 ===");
		for(int i = 0 ; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("=== bookArray2 ===");
		
		for(int i = 0 ; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();// 깊은복사
		}
		
		//향상된 포문
		
		String[] strArr = {"Java", "Android", "C" };
		for (String s : strArr) {
			System.out.println(s);	
		}
		
		int[] arr = {1,2,3,4,5};
		for (int num : arr ) { 
			System.out.println(num);
		}
		
	}

}
