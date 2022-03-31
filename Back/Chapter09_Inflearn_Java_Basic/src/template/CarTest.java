package template;

public class CarTest {

	public static void main(String[] args) {

		Car myCar = new ManualCar();
		myCar.run();
		
		System.out.println("===============");
		Car yourCar = new AICar();
		yourCar.run();
	}

}
