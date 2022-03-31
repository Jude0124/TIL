package mc.ys.lesson8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import mc.ys.lesson7.GisaDataVO;

public class MysqlMain {

	public static void main(String[] args) {
		MysqlMain mm = new MysqlMain();
		mm.test1();

//		try {
//			mm.test();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//			System.out.println("해당 파일이 없어 DB작업이 불가능합니다." + e.getMessage());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("정상 종료합니다.");
	}

	public void test2() {
		try {
			this.deleteData(new int[] { 990001, 990010 });
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void test1() {
		// 한줄의 데이터를 생성할 것이다.
		// readyData를 호출하여 100개의 데이터를 가진 list를 가지고 오는 코드 작성
		ArrayList<GisaDataVO> list = null;
		try {
			list = this.readyData();
			this.insertData(list);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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

	public void insertData(ArrayList<GisaDataVO> list) throws SQLException {
		ConnectionManager cm = new ConnectionManager();
		Connection con = cm.getConnection();

		Statement stmt = con.createStatement(); // new Statement() x
		for (GisaDataVO vo : list) {
			StringBuffer sql = new StringBuffer("insert into gisatbl values(");
			sql.append(vo.getStudentID() + ",'");
			sql.append(vo.getEmailAddress() + "',");
			sql.append(vo.getKorean() + ",");
			sql.append(vo.getMath() + ",");
			sql.append(vo.getEnglish() + ",");
			sql.append(vo.getScience() + ",");
			sql.append(vo.getHistory() + ",");
			sql.append(vo.getTotal() + ",'");
			sql.append(vo.getMgrCode() + "','");
			sql.append(vo.getAccCode() + "','");
			sql.append(vo.getLocCode());
			sql.append("');");
			System.out.println(sql.toString());

			// 쿼리 지나가는 통로 작성 : Statement 인스턴스 생성

			int affectedCount = stmt.executeUpdate(sql.toString());
			if (affectedCount > 0) {
				System.out.println("삽입 작업 완료");
			} else {
				System.out.println("삽입 작업 실패");
			}
		}
		stmt.close();
		con.close();
	}

	public void insertData(GisaDataVO vo) throws SQLException {
//		String sql = "insert into gisatbl values("+vo.getStudentID()+")";
//		sql = sql + vo.getEmailAddress();
		// StringBuffer/StringBuilder
		// 긴 쿼리를 구성하는 방법
		// query를 구성하는 방법에 대한 솔루션
		StringBuffer sql = new StringBuffer("insert into gisatbl values(");
		sql.append(vo.getStudentID() + ",'");
		sql.append(vo.getEmailAddress() + "',");
		sql.append(vo.getKorean() + ",");
		sql.append(vo.getMath() + ",");
		sql.append(vo.getEnglish() + ",");
		sql.append(vo.getScience() + ",");
		sql.append(vo.getHistory() + ",");
		sql.append(vo.getTotal() + ",'");
		sql.append(vo.getMgrCode() + "','");
		sql.append(vo.getAccCode() + "','");
		sql.append(vo.getLocCode());
		sql.append("');");
		System.out.println(sql.toString());

		ConnectionManager cm = new ConnectionManager();
		Connection con = cm.getConnection();
		// 쿼리 지나가는 통로 작성 : Statement 인스턴스 생성
		Statement stmt = con.createStatement(); // new Statement() x
		int affectedCount = stmt.executeUpdate(sql.toString());
		if (affectedCount > 0) {
			System.out.println("삽입 작업 완료");
		} else {
			System.out.println("삽입 작업 실패");
		}
		stmt.close();
		con.close();
	}

	public void deleteData(int[] stdNo) throws SQLException {
		// sql 작성
		StringBuffer sql = new StringBuffer("delete from gisatbl where std_no =" + stdNo[0]);
		// Connection con 취득
		Connection con = new ConnectionManager().getConnection();
		// Statement 생성
		Statement stmt = con.createStatement();
		// 쿼리전송
		int affectedCount = stmt.executeUpdate(sql.toString());

		// 쿼리 결과 평가
		if (affectedCount > 0) {
			// 작업성공여부 확인
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}

		// 연결종료
		stmt.close();
		con.close();

	}

	public void test() throws ClassNotFoundException, SQLException {
		// 서버접속에 필요한 정보
		String url = "jdbc:mysql://localhost:3306/shopdb";
		// 접속한 뒤에 작업을 하기 위해 필요한 라이브러리 클래스
		String driver = "com.mysql.cj.jdbc.Driver";
		// 아이디
		String id = "root";
		// 비번
		String pwd = "mcys1309";

		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, id, pwd);

		if (con != null) {
			System.out.println("connected");
			con.close();
		} else {
			System.out.println("fail connection");
		}
	}
}
