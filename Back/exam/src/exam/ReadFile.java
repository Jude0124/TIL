package exam;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class ReadFile {
  public static void main(String[] args) throws IOException {
	ArrayList<data> datas = new ArrayList<data>();
    BufferedReader br = new BufferedReader(
    		new FileReader(ReadFile.class.getResource("").getPath() + "Abc1115.txt")
    		);
    while(true) {
        String line = br.readLine();
        if (line==null) break;
    	data info = new data(line);
    	datas.add(info);
    }
    br.close();
	System.out.println("|번호\t|학번\t\t|이메일\t|국어점수\t|영어점수\t|수학점수\t|과학점수\t|국사점수\t|총점\t|담임코드\t|성취도\t|지역코드\t|");
    for(int i=0; i<2; i++) {
    	System.out.printf("|%3d\t|", i);
        datas.get(i).print();
    }
  }
}
