package witharraylist;

public class Customer {
//	자전거라는 객체 안에 바퀴수 
//	전기자전거 extends 배터리충전량
	
//	자전거 a = new 전기자전거();
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	protected double bonusRatio;
	
	public Customer()
	{
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
//		System.out.println("Customer() 호출");
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
//		System.out.println("Customer(int,String) 호출");
	}
	
	public int calcPrice(int price) {
		
		if (customerGrade == "SILVER") {
			bonusPoint += price * bonusRatio;
		}
		else if(customerGrade == "VIP") {
			
		}
		else if(customerGrade == "VIP") {
			
		}
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " 
				+ bonusPoint + "입니다.";
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}
