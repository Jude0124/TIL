package mc.ys.lesson5;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test1() 호출하는 코드 작성
		ArrayListTest at = new ArrayListTest();
		at.test1();
	}
	
	public void test1() {
		System.out.println("ArrayList test!");
		//ArrayList 인스턴스 생성하시오
		ArrayList list = new ArrayList();
		//create (생성)
		list.add(new Integer(10)); //다형성 1코드
		list.add(new Integer(2));
		list.add(new Integer(3));
		//list.add(new String("four"));
		int size = list.size();
		System.out.printf("size = %d %n", size);
		//조회
		Integer num = (Integer)list.get(0); //다형성 2코드
		int number = num.intValue();
		System.out.println(number);
		//전체조회
		this.print(list);
		//수정
		list.set(0, new Integer(1));
		this.print(list);
		//삭제
		Integer delNumber = (Integer)list.remove(2);
		System.out.printf("delete Object number = %d %n",delNumber.intValue());
		this.print(list);
	}
	
	public void print(ArrayList list) {
		for(int i=0;i<list.size();i++) {
			Integer temp = (Integer)list.get(i);
			System.out.printf("the value is %d %n", temp.intValue());
		}
		System.out.println();
	}

}
