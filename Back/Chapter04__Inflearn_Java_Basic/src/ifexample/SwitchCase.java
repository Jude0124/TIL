package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		int rank = 1;
		char medalColor;
		
		switch(rank) {
			case 1 : medalColor = 'G';
					break;
			case 2 : medalColor = 'S';
					break;
			case 3 : medalColor = 'B';
					break;
			default : medalColor = 'A';	//어떤 케이스에도 해당하지 않는 경우
		}
		System.out.printf("%d등의 매달 색은 %s입니다.",rank,medalColor);
		
	}
}
