package customer.vo;
//VO(Value Object),DTO(Data Transfer Object), Entity, Bean
//: ���ü� �ִ� ����Ÿ���� �ϳ��� ������ �ִ� ��ü
public class CustomerVO{
	private String id;
	private String password;
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
