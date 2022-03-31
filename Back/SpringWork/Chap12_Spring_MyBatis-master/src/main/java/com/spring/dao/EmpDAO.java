package com.spring.dao;

import java.util.List;

import com.spring.deptdto.DeptDTO;
import com.spring.dto.EmpDTO;

public interface EmpDAO {
	public List<EmpDTO> list();	// 전체 리스트 검색하는 추상 메서드 
	
	public void insert(EmpDTO dto);	//사원을 추가하는 메소드 
	
	public EmpDTO cont(int empno);	// 특정 상세 내역을 조회하는 추상메서드 
	
	public void update(EmpDTO dto);
	
	public void delete(int empno);
	
	public List<DeptDTO> deptList();
	
}
