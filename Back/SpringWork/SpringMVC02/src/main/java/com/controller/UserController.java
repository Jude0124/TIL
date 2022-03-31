package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.entity.User;
import com.model.UserService;

//@RequestMapping("/login") // 각각의 메서드들이 request mapping이 되어있음에도 가령
// 로그인의 CRUD인지 게시판의 CRUD인지 구분하기위해서 어노테이션을 별도로 걸어줄 수 있다. 
@Controller
public class UserController {

	@Autowired
	private UserService userService;

	// 입력 페이지로 이동
// 위와 동일	@RequestMapping(value = "/insert.sp",method = RequestMethod.GET)
	@RequestMapping("/insert.sp")
	public String insertPage() {
		return "insert";
	}
//	/WEB-INF/view/insert.jsp
	// 입력하기 : 입력 페이지에서 값을 받아서 (Entity)로 전달한 객체를 비즈(서비스)로 DAO를 통해 저장하게 된다.

	@RequestMapping(value = "/insert_res.sp", method = RequestMethod.POST)
	public ModelAndView insertRes(@ModelAttribute User user) {
		/*
		 * if (userService.insertUser(user) == true) { return "/list.sp"; } else {
		 */
			return new ModelAndView("insert");
		
	}

	/*
	 * // 입력하기 : 입력 페이지에서 값을 받아서 (Entity)로 전달한 객체를 비즈(서비스)로 DAO를 통해 저장하게 된다.
	 * 
	 * @RequestMapping(value = "/insert_res.sp", method = RequestMethod.POST) public
	 * String insertRes(@ModelAttribute User user) { if
	 * (userService.insertUser(user) == true) { return "/list.sp"; } else { return
	 * "/WEB-INF/view/insert.jsp"; } }
	 * 
	 */
	
	// 전체 출력페이지
	@RequestMapping("/list.sp")
	public ModelAndView list() {
		ModelAndView model = new ModelAndView("list", "list", userService.listUser());
		return model;
	}
		/*
		 * // 전체 출력페이지
		 * 
		 * @RequestMapping("/list.sp") 
		 * public String list(Model model) {
		 *      model.addAttribute("all_list", userService.listUser()); 
		 * 		return "/WEB-INF/view/list.jsp";
		 * }
		 */
	

}
