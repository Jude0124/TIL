package mc.ys.lesson5;		

import java.util.ArrayList;

public class ArrayListTestver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test1() 호출하는 코드 작성
		ArrayListTestver2 at =  new ArrayListTestver2();
		at.test1();
	}
	
	public void test1() {
		System.out.println("ArrayList test!");
		//ArrayList 인스턴스 생성하시오
		ArrayList list = new ArrayList();
		list.add(new Integer(10)); //AutoUnboxing
		list.add(new Integer(2));
		list.add(new Integer(3));
//		list.add(new String("four"));
		int size = list.size();
		System.out.printf("size = %d %n", size);
		
		//조회
		int number = (Integer)list.get(0); //AutoUnboxing
		
		System.out.println(number);
		print(list);
		
		//수정
		list.set(0,1);
		this.print(list);
		//삭제
		Integer delNumber = (Integer)list.remove(2);
		System.out.printf("delete Object number = %d %n", delNumber.intValue());
		this.print(list);
		
		
		
	}
	public void print(ArrayList<Integer> list) {
		for (int i = 0 ; i<list.size(); i++) {
			int temp = list.get(i);
			System.out.printf("the value is %d %n",temp);
//			System.out.printf("size = %s %n",list.get(i));
		}
	}
}
