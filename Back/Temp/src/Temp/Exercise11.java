package Temp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Exercise11 {
	public static void main(String[] args) {
		String path = Exercise11.class.getResource("").getPath();
		try (BufferedReader br = new BufferedReader(new FileReader(path + "input.txt"))){
			String reader = new String();
			HashMap<String,String> dic = new HashMap<String,String>();
			while(reader != null) {
				reader = br.readLine();
				String[] str = reader.split(":");
				dic.put(str[0],str[1]);
			}
		} catch (Exception e) {
			System.out.println("오류발생");
		}
	}

}
