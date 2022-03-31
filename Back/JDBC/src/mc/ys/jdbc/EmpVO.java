package mc.ys.jdbc;

import java.sql.Timestamp;

public class EmpVO {
	private int empCode;
	//emp테이블 정의서를 이용하여 데이터클래스를 완성하세요
	private String empName;
	private int empAge;
	private Timestamp empHiredate;
	private int empSalary;
	private String deptCode;
	
	
	public EmpVO(int empCode, String empName, int empAge, Timestamp empHiredate, int empSalary, String deptCode) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.empAge = empAge;
		this.empHiredate = empHiredate;
		this.empSalary = empSalary;
		this.deptCode = deptCode;
	}
	public int getEmpCode() {
		return empCode;
	}
	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public Timestamp getEmpHiredate() {
		return empHiredate;
	}
	public void setEmpHiredate(Timestamp empHiredate) {
		this.empHiredate = empHiredate;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	@Override
	public String toString() {
		return "EmpVO [empCode=" + empCode + ", empName=" + empName + ", empAge=" + empAge + ", empHiredate="
				+ empHiredate + ", empSalary=" + empSalary + ", deptCode=" + deptCode + "]";
	}
	
	
	
}
