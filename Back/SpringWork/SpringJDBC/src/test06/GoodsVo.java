package test06;

public class GoodsVo {

	public GoodsVo(String code, String name, int price, String maker) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.maker = maker;
	}
	private String code;
	private String name;
	private int price;
	private String maker;
	
	
	public GoodsVo() {
		super();
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	@Override
	public String toString() {
		return "GoodsVo [code=" + code + ", name=" + name + ", price=" + price + ", maker=" + maker + "]";
	}

}
