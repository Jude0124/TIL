package mc.ys.lesson7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileCopy fc = new FileCopy();
		try {
		fc.copyFileV3();
		} catch (IOException e) {
			System.out.println("복사중 문제 발생");
			e.printStackTrace();
		}
		
		
		
	}
	
	public void copyFileV3() throws IOException {
		// singleton.PNG를 복사한다.
		File srcFile = new File("./data/Abc1115.txt");
		File destFile = new File("./data/CopyAbc1115UsingStream.txt");
		// crtl + shift + O -> Automatically import
		// 파일 클래스는 디렉토리에 경로를 지정할 수 있다.

		FileInputStream fis = new FileInputStream(srcFile);
		
		FileOutputStream fos = new FileOutputStream(destFile);
		
		byte[] data = new byte[16];
		
		System.out.println("복사를 시작합니다.");
		long start = System.currentTimeMillis();
		while (( fis.read()) != -1) { // -1은 파일의 마지막 끝을 의미... 마지막에 도달할때까지 읽어라
			//복사하는 코드
			fos.write(data,0,data.length);
			
		}
		long end = System.currentTimeMillis();
		fis.close();
		fos.close();
		System.out.println("복사가 끝났습니다.");
		System.out.printf("%d millis가 소요되었습니다.",(end-start));
		

	}
	public void moveFile() throws IOException {
		// singleton.PNG를 복사한다.
		File srcFile = new File("./data/nvm-setup.zip");
		File destFile = new File("./data/nvm-setup.zip");
		// crtl + shift + O -> Automatically import
		// 파일 클래스는 디렉토리에 경로를 지정할 수 있다.

		FileInputStream fis = new FileInputStream(srcFile);
		
		FileOutputStream fos = new FileOutputStream(destFile);
		
		byte[] data = new byte[256];
		
		System.out.println("복사를 시작합니다.");
		long start = System.currentTimeMillis();
		while (( fis.read()) != -1) { // -1은 파일의 마지막 끝을 의미... 마지막에 도달할때까지 읽어라
			//복사하는 코드
			fos.write(data,0,data.length);
			
		}
		long end = System.currentTimeMillis();
		fis.close();
		fos.close();
		System.out.println("복사가 끝났습니다.");
		srcFile.delete();
		System.out.printf("%d 초가 소요되었습니다.",(end-start));
		

	}
	public void copyFile2() throws IOException {
		// singleton.PNG를 복사한다.
		File destFile = new File("./data/nvem-setup.zip");
		File srcFile = new File("./data/nvm-setupCopy.zip");
		// crtl + shift + O -> Automatically import
		// 파일 클래스는 디렉토리에 경로를 지정할 수 있다.

		FileInputStream fis = new FileInputStream(srcFile);
		
		FileOutputStream fos = new FileOutputStream(destFile);
		
		byte[] data = new byte[256];
		
		System.out.println("복사를 시작합니다.");
		long start = System.currentTimeMillis();
		while (( fis.read()) != -1) { // -1은 파일의 마지막 끝을 의미... 마지막에 도달할때까지 읽어라
			//복사하는 코드
			fos.write(data,0,data.length);
			
		}
		long end = System.currentTimeMillis();
		fis.close();
		fos.close();
		System.out.println("복사가 끝났습니다.");
		System.out.printf("%d 초가 소요되었습니다.",(end-start)/1000);
		

	}
	public void copyFile() throws IOException {
		// singleton.PNG를 복사한다.
		File srcFile = new File("./data/singleton.PNG");
		File destFile = new File("./data/singletonCopy.PNG");
		// crtl + shift + O -> Automatically import
		// 파일 클래스는 디렉토리에 경로를 지정할 수 있다.

		FileInputStream fis = new FileInputStream(srcFile);
		
		FileOutputStream fos = new FileOutputStream(destFile);
		
		int data = 0;
		while ((data = fis.read()) != -1) { // -1은 파일의 마지막 끝을 의미... 마지막에 도달할때까지 읽어라
			//복사하는 코드
			fos.write(data);
			
		}
		
		fis.close();
		fos.close();
		System.out.println("복사가 끝났습니다.");
		

	}
}