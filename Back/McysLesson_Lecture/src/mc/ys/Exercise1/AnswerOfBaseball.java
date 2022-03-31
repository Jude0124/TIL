package mc.ys.Exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnswerOfBaseball {
	
	public int Answer(){

		Random rnd = new Random();
		
		int answer = rnd.nextInt(8999)+1000;
		List<Integer> chars = new ArrayList<Integer>();
		
		for (int i = 0 ; i <4 ; i ++) {
			int j = (int)Math.pow(10, i+1);
			chars.add(answer%(j)/(j/10));
			for (int k = 0 ; k < i ; k ++) {
				//if (chars[k] == chars
			}
		}
		
		System.out.println(answer);
		
		return rnd.nextInt(22);
		
		
	}
	
	public static void main(String[] args) {
		AnswerOfBaseball abc = new AnswerOfBaseball();
		abc.Answer();
	}

}
