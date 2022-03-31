package customer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import customer.biz.CustomerBiz;
import customer.dao.CustomerDao;
import customer.vo.CustomerVO;

@Controller
public class CustomerSelect {
	@Autowired
	private CustomerBiz biz;
	
	

	@RequestMapping("/customerSelect.do")
	public ModelAndView select(){
		List<CustomerVO> list=biz.select();
		ModelAndView mav=new ModelAndView("customer/list","list",list);
		return mav;
	}
}





