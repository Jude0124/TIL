package customer.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import customer.dao.CustomerDao;
import customer.vo.*;

@Service
public class CustomerBiz {

	@Autowired
	private CustomerDao customerDao;

	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public String insert(CustomerVO vo) {
		return customerDao.insert(vo);
	}

	public List<CustomerVO> select() {
		return customerDao.select();
	}

	public CustomerVO searchCustomer(String id) {
		return customerDao.searchCustomer(id);
	}

}
