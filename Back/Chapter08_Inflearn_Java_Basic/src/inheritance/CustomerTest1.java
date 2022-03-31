package inheritance;


public class CustomerTest1 {

	public static void main(String[] args) {
		
//		Customer customerLee = new Customer(10100,"Lee");
//		customerLee.setCustomerID(10100);
//		customerLee.setCustomerName("Lee");

//		VIPCustomer customerPark = new VIPCustomer(10102,"Park");
		
//		Customer customerLee = new Customer(10103,"Lee");
		
//		System.out.println(customerKim.getClass());
//		System.out.println(customerPark.getClass());
		
		VIPCustomer customerKim = new VIPCustomer(10101,"kim",100);
		
		VIPCustomer VcustomerKim = new VIPCustomer(10101,"Kim",100);
		
		VcustomerKim = (VIPCustomer)customerKim;
		
		
//		customerPark =  (VIPCustomer)customerLee;
		
//		VIPCustomer customerLee = (VIPCustomer) customerKim; // 2코드
//		System.out.println(customerPark.showCustomerinfo());
//		System.out.println(customerKim.showCustomerinfo());
		
//		System.out.println(customerKim.showCustomerinfo());
//		System.out.println(customerLee.showCustomerinfo());
//		
//		System.out.println(customerLee);
		
		customerKim.bonusPoint = 1000;
		
//		customerKim.setCustomerID(10101);
//		customerKim.setCustomerName("Kim");
		 
//		System.out.println(customerLee.showCustomerinfo());
		System.out.println(customerKim.showCustomerinfo());
		
	}

}
