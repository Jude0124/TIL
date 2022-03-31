package sample02;

//has a 관계 [생성자, setter]로 값 전달 및 변경
public class ListAddress {
	private Address addr;

	public ListAddress() {
		super();
		System.out.println("ListAddress 기본 생성자 ");
	}

	public ListAddress(Address addr) {
		super();
		this.addr = addr;
		System.out.println("ListAddress 매개인자 생성자 ");
	}

	public Address getAddr() {
		return addr; // addr.toString();
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
}
