package sample;

import javax.swing.JOptionPane;


class ThreadEx_06 extends Thread {
	
	public void run() {
		
		int i = 10;
		
		while(i != 0 && !isInterrupted()) {
			System.out.println(i--);
//			for(long k=0; k<250000000000000000L ; k++); //시간지연
			// busy-waiting
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				interrupt();
			}
			// sleep()상태에서 interrupt()가 호출되면
			// exception이 발생해요
			// Exception이 발생하게 되면 Thread의
			// interrrupted state가 초기화되요!(false)
		}
	}
}

public class ThreadExam06{
	public static void main(String[] args) {
		
		Thread t = new ThreadEx_06();
		
		t.start();
		
		String input = JOptionPane.showInputDialog("숫자를 입력하세요!");
		System.out.println("입력한 값은 : " + input);
	}
}





 