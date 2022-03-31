package javaProject1;

public class Product {
	int prdPrice, prdYear;
	String prdNo, prdName, prdMaker;

	public Product(String prdNo, String prdName, int prdPrice, int prdYear, String prdMaker) {
		this.prdNo = prdNo;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
		this.prdYear = prdYear;
		this.prdMaker = prdMaker;

	}

	@Override
	public String toString() {
		return prdNo + "\t"+ prdName + "\t" + prdYear + "\t" + prdPrice + "\t" + prdMaker;
	}

}
