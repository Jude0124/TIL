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
	System.out.println("|��ȣ\t|�й�\t\t|�̸���\t|��������\t|��������\t|��������\t|��������\t|��������\t|����\t|�����ڵ�\t|���뵵\t|�����ڵ�\t|");
    for(int i=0; i<2; i++) {
    	System.out.printf("|%3d\t|", i);
        datas.get(i).print();
    }
  }
}
