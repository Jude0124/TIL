package mc.ys.lesson7;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTestPractice {

	public static void main(String[] args) {
		FileTestPractice ft = new FileTestPractice();
		ft.test();
		ft.testFileCopy();
		
		
		
		//파일의 현재 경로 조회하는 법
		Path path = Paths.get("");
		String directoryName = path.toAbsolutePath().toString();
		System.out.println("Current Working Directory is = " + directoryName);
	}
	public void test() {
		File file = new File("./data/Abc1115.txt");
		
		if (file.exists()) {
			System.out.printf("file name is %s %n", file.getName());
		}
	}
	
	public void testFileCopy() {
		
	}
}
