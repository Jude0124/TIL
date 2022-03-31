 package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Customer customerLee = new Customer(100010,"LEE");
		int price = customerLee.calcPrice(10000);
		System.out.println("지불금액은" + price+"이고, " + customerLee.showCustomerinfo());
		
		VIPCustomer customerKim = new VIPCustomer(1000010,"Kim",100);
		price = customerKim.calcPrice(10000);
		System.out.println("지불금액은" + price +"이고, "+customerKim.showCustomerinfo());
	*/
		
	Customer customerWho = new VIPCustomer(100010,"who",100);
	int  price = customerWho.calcPrice(10000);
	System.out.println("지불금액은" + price +"이고, "+customerWho.showCustomerinfo());
	
	Customer customerGold = new GoldCustomer();
	
	}

}
