package com.entity;
import com.vo.ScoreVO;
public class ScoreEntity extends ScoreVO {
	private int tot;
	private double avg;
	private String grad;	

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public ScoreEntity(int tot, double avg, String grad) {
		super();
		this.tot = tot;
		this.avg = avg;
		this.grad = grad;
	}

	public ScoreEntity() {
		super();
	}

	public ScoreEntity(String name, int kor, int eng, int mat) {
		super(name, kor, eng, mat);
	}
	
	public ScoreEntity(String name, int kor, int eng, int mat, int tot,double avg,String grad) {
		super(name, kor, eng, mat);
		this.tot = tot;
		this.avg = avg;
		this.grad = grad;
	}

	
}



