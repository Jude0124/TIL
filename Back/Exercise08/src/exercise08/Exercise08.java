package exercise08;

public class Exercise08 {

	public static void main(String[] args) {
		Salesman s =new Salesman();
		Manager m = new Manager();
		Consultant c = new Consultant();
		
		print(s);
		print(m);
		print(c);
	}
	
	private static class Posit{String pos;}private static class Salesman extends Posit{Salesman(){this.pos = "Salesman";}}private static class Manager extends Posit{Manager(){this.pos = "Manager";}}private static class Consultant extends Posit{Consultant(){this.pos = "Consultant";}}private static void print(Posit p) {System.out.println(p.pos+"입니다.");
	}
}
