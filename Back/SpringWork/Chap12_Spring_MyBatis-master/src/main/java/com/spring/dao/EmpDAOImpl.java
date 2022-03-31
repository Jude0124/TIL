package com.spring.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.deptdto.DeptDTO;
import com.spring.dto.EmpDTO;


@Repository
public class EmpDAOImpl implements EmpDAO{
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<EmpDTO> list() {

		
		return this.sqlSession.selectList("selectAll");
	}

	@Override
	public void insert(EmpDTO dto) {
		
		
		this.sqlSession.insert("insert", dto);
	}

	@Override
	public EmpDTO cont(int empno) {
		// TODO Auto-generated method stub
		return this.sqlSession.selectOne("recode", empno);
	}

	@Override
	public void update(EmpDTO dto) {
	this.sqlSession.update("update",dto);
		
	}

	@Override
	public void delete(int empno) {
		// TODO Auto-generated method stub
		this.sqlSession.delete("delete",empno);
	}

	@Override
	public List<DeptDTO> deptList() {
		
		return this.sqlSession.selectList("deptAll");
	}
}
