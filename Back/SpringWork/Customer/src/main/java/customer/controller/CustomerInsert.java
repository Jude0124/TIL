package customer.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import customer.biz.CustomerBiz;
import customer.dao.CustomerDao;
import customer.vo.CustomerVO;

@Controller
public class CustomerInsert {
	@Autowired
	private CustomerBiz biz;
	
	

	@RequestMapping("/customerInsert.do") 
	public ModelAndView insert(CustomerVO  vo){
		String result=biz.insert(vo);	
		ModelAndView mav=new ModelAndView("customer/result", "myresult" , result);
		return mav; 
	}	
}





