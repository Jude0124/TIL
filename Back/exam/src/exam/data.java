package exam;

public class data {
	String 학번 = "";
	String 이메일 = "";
	String 국어점수 = "";
	String 영어점수 = "";
	String 수학점수 = "";
	String 과학점수 = "";
	String 국사점수 = "";
	String 총점 = "";
	String 담임코드 = "";
	String 성취도 = "";
	String 지역코드 = "";
	public data(String data) {
		String[] Data = data.split("");
		for(int i=0; i<Data.length; i++) {
			if(i<6)학번 += Data[i];
			else if(i<10)이메일 += Data[i];
			else if(i<13)국어점수 += Data[i];
			else if(i<16)영어점수 += Data[i];
			else if(i<19)수학점수 += Data[i];
			else if(i<22)과학점수 += Data[i];
			else if(i<25)국사점수 += Data[i];
			else if(i<28)총점 += Data[i];
			else if(i<29)담임코드 += Data[i];
			else if(i<30)성취도 += Data[i];
			else if(i<31)지역코드 += Data[i];
		}
	}
	public void print() {
		System.out.print(학번);
		System.out.print("|\t\t");
		System.out.print(이메일);
		System.out.print("|\t");
		System.out.print(국어점수);
		System.out.print("|\t");
		System.out.print(영어점수);
		System.out.print("|\t");
		System.out.print(수학점수);
		System.out.print("|\t");
		System.out.print(과학점수);
		System.out.print("|\t");
		System.out.print(국사점수);
		System.out.print("|\t");
		System.out.print(총점);
		System.out.print("|\t");
		System.out.print(담임코드);
		System.out.print("|\t");
		System.out.print(성취도);
		System.out.print("|\t");
		System.out.print(지역코드);
		System.out.println();
	}
}
