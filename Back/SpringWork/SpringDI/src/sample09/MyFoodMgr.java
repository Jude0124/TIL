package sample09;

public class MyFoodMgr {

	private Food favoiteFood;
	private Food unFavoriteFood;
	public MyFoodMgr() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MyFoodMgr(Food favoiteFood, Food unFavoriteFood) {
		super();
		this.favoiteFood = favoiteFood;
		this.unFavoriteFood = unFavoriteFood;
	}


	public void setFavoiteFood(Food favoiteFood) {
		this.favoiteFood = favoiteFood;
	}


	public void setUnFavoriteFood(Food unFavoriteFood) {
		this.unFavoriteFood = unFavoriteFood;
	}


	@Override
	public String toString() {
		return "MyFoodMgr [favoiteFood=" + favoiteFood + ", unFavoriteFood=" + unFavoriteFood + "]";
	}

}
