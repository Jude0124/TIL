package thisex;

class Birthday {
	int day;
	int month;
	int year;
	public void setYear(int year) { 
		this.year = year;
	}

	public void PrintThis() {
		System.out.println(this);
	}
	
}


public class ThisExamsple {

	public static void main(String[] args) {
		
		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		System.out.println(b1);
		b1.PrintThis();
		
		System.out.println(b2);
		b2.PrintThis();

	}

}
