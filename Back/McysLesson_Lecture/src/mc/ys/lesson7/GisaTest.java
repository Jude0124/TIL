package mc.ys.lesson7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class GisaTest {
	public static void main(String[] args) {
		GisaTest gt = new GisaTest();
//		gt.testString();
		gt.testStart();

	}

	public void testStart() {

		try {
			
			this.solveOne();
//			this.solveTwo();
//			this.solveThree();
//			this.solveFour();

		} catch (FileNotFoundException fnf) {
			// TODO Auto-generated catch block
			System.out.println("정답 작성중 파일 찾지 못함");
			// fnf.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("정답 작성중 에러");
			// e.printStackTrace();
		}

	}

	private void solveThree() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		ArrayList<GisaDataVO> list = this.readyData();
		String answer = null;
		int sum = 0; //총점 + point 누계
		for(GisaDataVO vo : list) {
			int point = 20; //담임코드 C의 값으로 초기화 
			if(vo.getEnglish()+vo.getMath()>=120) {
				if(vo.getMgrCode().equals("A")) {
					point = 5;
					
				} else if(vo.getMgrCode().equals("B")) {
					point = 15;
				}
				
			}
			int total = vo.getTotal()+  point; //총점 + point 
			sum +=total;
		}
		answer = String.valueOf(sum);
		this.writeAnswer(answer,3);
	}

	private void solveFour() throws FileNotFoundException, IOException {
		ArrayList<GisaDataVO> list = this.readyData();
		String answer = null;
		int count = 0;
		for (GisaDataVO vo : list) {
			int point = 15; // 지역코드 C의 값으로 초기화
			if (vo.getAccCode().equals("A") || vo.getAccCode().equals("B")) {
				if (vo.getLocCode().equals("A")) {
					point = 5;
				} else if (vo.getLocCode().equals("B")) {
					point = 10;
				}
			}
			int total = vo.getKorean() + point;
			if (total >= 50) {
				count++;
			}
		}
		answer = String.valueOf(count);
		this.writeAnswer(answer,4);

	}

	private void writeAnswer(String answer, int order) throws IOException { // 1~4번까지 모두 사용
		// TODO Auto-generated method stub
		// 해당하는 정답을 파일에 작성한다.
		String filePath = "./data/Ans" + order + ".txt";
		File file = new File(filePath);
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(answer);
		pw.close();
		fw.close();

	}

	private void solveOne() throws FileNotFoundException, IOException {
		ArrayList<GisaDataVO> list = this.readyData();
		ArrayList<GisaDataVO> temp = new ArrayList<GisaDataVO>();
		//지역코드 B인 것만 따로 리스트로 구성
		for (GisaDataVO vo : list) {
			if (vo.getLocCode().equals("B")) {
				temp.add(vo);
			}
		}
		Collections.sort(temp, new MyComparator());
		int answer = temp.get(4).getStudentID();
		this.writeAnswer(String.valueOf(answer),1);
		this.print(temp);
	}


	private void print(ArrayList<GisaDataVO> temp) {
		// TODO Auto-generated method stub
		
	}

	private void solveTwo() throws FileNotFoundException, IOException {
		ArrayList<GisaDataVO> list = this.readyData();
		// TODO Auto-generated method stub
		String answer = null;
		// 해당하는 문제를 해결하는 로직 작성(최대값 로직)
		int max = 0;
		GisaDataVO vo = null;
		for (int i = 0; i < list.size(); i++) {
			vo = list.get(i);
			if (vo.getLocCode().equals("B")) {
				if(max<(vo.getKorean()+vo.getEnglish())) {
					max = vo.getKorean()+vo.getEnglish();
				}
					
			}
		}
		answer = String.valueOf(max);

		this.writeAnswer(answer, 2);
	}
	
	private void solveTwo2() throws FileNotFoundException, IOException {
		ArrayList<GisaDataVO> list = this.readyData();
		// TODO Auto-generated method stub
		String answer = null;
		// 해당하는 문제를 해결하는 로직 작성(최대값 로직)
		int max = 0;
		for (GisaDataVO vo : list) {
			if (vo.getLocCode().equals("B")) {
				int temp = vo.getEnglish() + vo.getKorean();
				max = max < temp ? temp : max;

			}
		}
		answer = String.valueOf(max);
		this.writeAnswer(answer, 2);
	}
	private ArrayList<GisaDataVO> readyData() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		ArrayList<GisaDataVO> list = new ArrayList<GisaDataVO>();

		// 파일의 1000라인의 정보를 GisaDataVO를 이용하여 인스턴스로 만들고 ArrayList에 저장
		// 파일에 접속해서 스트림에 연결
		File file = new File("./data/Abc1115.txt");
		FileReader fr = new FileReader(file);
		// 한줄씩 읽기
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		GisaDataVO vo = null;
		while ((line = br.readLine()) != null) {
			// 한줄을 분석해서
			int studentID = Integer.parseInt(line.substring(0, 6));
			String emailAddress = line.substring(6, 10);
			int korean = Integer.parseInt(line.substring(10, 13).trim());
			int english = Integer.parseInt(line.substring(13, 16).trim());
			int math = Integer.parseInt(line.substring(16, 19).trim());
			int science = Integer.parseInt(line.substring(19, 22).trim());
			int history = Integer.parseInt(line.substring(22, 25).trim());
			int total = Integer.parseInt(line.substring(25, 28).trim());
			String mgrCode = line.substring(28, 29);
			String accCode = line.substring(29, 30);
			String locCode = line.substring(30, 31);
			// VO객체에 할당하고 리스트에 저장(리스트는 이미 존재해야 함 )
			vo = new GisaDataVO();
			vo.setStudentID(studentID);
			vo.setEmailAddress(emailAddress);
			vo.setKorean(korean);
			vo.setEnglish(english);
			vo.setMath(math);
			vo.setScience(science);
			vo.setHistory(history);
			vo.setTotal(total);
			vo.setMgrCode(mgrCode);
			vo.setAccCode(accCode);
			vo.setLocCode(locCode);
			// 리스트에 저장
			list.add(vo);
		}
		br.close();
		fr.close();
		return list;
	}

	public void testString() {
		String line = "990001addx 17 29 16 49 43154CAC";
		// 0123456789012345678901234567890
		// 6 4 3 3 3 3 3 3 1 1 1
		// 학번과 국어점수를 분리하여 지시문에서 선언된 타입으로 변수에 할당하시오.
		int StudentID = Integer.parseInt(line.substring(0, 6));
		int Korean = Integer.parseInt(line.substring(10, 13).trim());
		System.out.printf("stdNo = %d kor = %d", StudentID, Korean);

	}
}
