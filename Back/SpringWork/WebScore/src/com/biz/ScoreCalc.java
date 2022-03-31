package com.biz;

// 연산을 구현하는 로직이기 때문에 매개인자가 있다. 연산의 결과를 entity에 담아 db에 보낸다.
public class ScoreCalc {
	public int getTot(int k, int e, int m) {
		return k + e + m;
	}
	public double getAvg( int d) {
		return (double) d / 3;
	}
	public String getGrad(double avg) {
		String grad;
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grad = "A";			break;
		case 8:
			grad = "B";
			break;
		case 7:
			grad = "C";
			break;
		case 6:
			grad = "D";
			break;
		default:
			grad = "F";
			break;
		}
		return grad;
	}
}
