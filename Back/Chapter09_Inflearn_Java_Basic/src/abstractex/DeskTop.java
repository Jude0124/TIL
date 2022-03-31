package abstractex;

public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("DeskTop displasy()");		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing()");
	}
	
	public void turon() {
		System.out.println("DeskTop TurnOn()");
	}
}
