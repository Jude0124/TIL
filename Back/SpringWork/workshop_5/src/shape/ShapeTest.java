package shape;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape[] = new Shape[6];
		Triangle sha1 = new Triangle(7, 5, "Blue");
		Rectangle sha2 = new Rectangle(4, 6, "Blue");
		Triangle sha3 = new Triangle(6, 7, "Red");
		Rectangle sha4 = new Rectangle(8, 3, "Red");
		Triangle sha5 = new Triangle(9, 8, "White");
		Rectangle sha6 = new Rectangle(5, 7, "White");
		shape[0] = sha1;
		shape[1] = sha2;
		shape[2] = sha3;
		shape[3] = sha4;
		shape[4] = sha5;
		shape[5] = sha6;

		System.out.println("기본정보");

		for (int i = 0; i < shape.length; i++) {
			System.out.println(shape[i]);
		}

		System.out.println("\n사이즈 변경 후 정보");

		sha1.setResize(5);
		sha2.setResize(5);
		sha3.setResize(5);
		sha4.setResize(5);
		sha5.setResize(5);
		sha6.setResize(5);
		for (int i = 0; i < shape.length; i++) {
			System.out.println(shape[i]);
		}

	}

}
