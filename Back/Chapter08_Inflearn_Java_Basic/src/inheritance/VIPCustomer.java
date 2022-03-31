package inheritance;

public class VIPCustomer extends Customer {
	
	
	private double saleRatio;
	private int agentID;
	
	public VIPCustomer(int customerID, String customerName,int agentID){
		
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIPCustomer(int, String) 호출"); //하위 클래스가 생성될때 상속해주는 상위 클래스가 
	}                                            //있다면 상위클래스가 먼저 호출된다.
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}											// 상위 클래스에 private 변수가 있다면 호출은 되서
												// 힙 메모리에 생성은 되지만 접근은 할 수 없다.
	public int getAgentID() {
		return agentID;
	}
	
}