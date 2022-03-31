package javaProject2;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book jp = new Book("B001","자바 프로그래밍","홍길동",25000,2021,"멀티출판사");
		Book js = new Book("B002","자바스크립트","이몽룡",30000,2020,"서울출판사");
		Book hc = new Book("B003","HTML/CSS","성춘향",18000,2021,"강남출판사");
		
		Book jw = new Magazine("M001","자바 월드","홍길동",25000,2021,"멀티출판사",5);
		Book ww = new Magazine("M002","웹 월드","이몽룡",30000,2020,"서울출판사",7);
		Book gw = new Magazine("M003","게임 월드","성춘향",18000,2021,"강남출판사",9);
	
		System.out.println("도서번호\t도서명\t\t저자\t가격\t발행일\t출판사");
		System.out.println("---------------------------------------------------------");
		System.out.println(jp);
		System.out.println(js);
		System.out.println(hc);
		System.out.println();
		System.out.println("잡지번호\t잡지명\t발행인\t가격\t발행연도\t출판사\t발행월");
		System.out.println("---------------------------------------------------------");
		System.out.println(jw);
		System.out.println(ww);
		System.out.println(gw);
	}

}
