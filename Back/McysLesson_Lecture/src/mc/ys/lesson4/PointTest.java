package mc.ys.lesson4;

public class PointTest {

	public static void main(String[] args) {
		
		PointTest pt = new PointTest();
		pt.test();
		
	}
	
	public void test() {
		Point p1 = new Point(10,20);
		Point p2 = new Point(20,30);
		System.out.println("  x   y");
		System.out.println("============");
		System.out.println(p1);
		System.out.println(p2);
		Point3D p3 = new Point3D(1,3,4);
		Point3D p4 = new Point3D(10,13,14);
		Point3D p5 = new Point3D(12,30,42);
		
		System.out.println("  x   y   z");
		System.out.println("============");
		
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
	}
}
