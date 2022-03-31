package customer.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import customer.vo.CustomerVO;

@Repository
public class CustomerDao {
	@Autowired
	private SqlSessionFactory factory;
	public String insert(CustomerVO vo) {
		SqlSession session = factory.openSession();
		String result = null;
		try {
			int n = session.insert("customer.insertCustomer", vo);
			if (n > 0)
				result = vo.getId();
			session.commit();
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		return result;
	}

	
	public List<CustomerVO> select() {
		  SqlSession   session=  factory.openSession();
		List<CustomerVO> list = null;
		try {
			list = session.selectList("customer.selectCustomer");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
	
	public CustomerVO searchCustomer(String vo) {//id값을 받아 
		  SqlSession   session=  factory.openSession();
		CustomerVO vo1 = null;
		try {
			vo1 = session.selectOne("customer.searchCustomer", vo);//객체로 리턴 한다. 
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return vo1;
	}

}











