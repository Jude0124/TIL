package sample09;

public class Food {

	private String foodName;
	private int foodPrice;

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	
	@Override
	public String toString() {
		return "Food [foodName=" + foodName + ", foodPrice=" + foodPrice + "]";
	}
}
