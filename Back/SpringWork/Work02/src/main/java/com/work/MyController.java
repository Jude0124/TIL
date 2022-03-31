package com.work;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.vo.User;

@Controller
public class MyController {

	// case 1: 바로 주소 이동
	@GetMapping("/login.do")
	public String myview(@RequestParam("id") String id, @RequestParam("pw") String pw) {
		System.out.println(id + "," + pw);
		if (id.equals("abcd") && pw.equals("1234")) {
			return "/ok"; // viewName
		} else {
			return "/fail"; // viewName
		}

	}

	// case 2: 일반 문자열 하나를 리턴, 응답페이지를 만들어 리턴(쓰지말기)
	@PostMapping("/test01/ex02.do")
	public void myView01(@RequestParam("username") String userName, HttpServletResponse res) {
		try {
			res.getWriter().print(userName);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// case 3: 일반 문자열 두개를 리턴, 응답페이지를 만들어 리턴 @ResponseBody(2.5어노테이션,
	// HttpServletResponse대신사용)
	@PostMapping("/test01/ex03.do")
	public @ResponseBody String myView02(@RequestParam("myid") String id, @RequestParam("mypw") String pw) {
		//String hap = null;
		//hap = "{id:" + id + " , pw :" + pw + "}";
		//return hap;
		if (id.equals("abcd") && pw.equals("1234")) {
			return "ok"; // viewName
		} else {
			return "fail"; // viewName
		}
	}

	// case 4: vo에 담아서, 페이지를 만들어 리턴 (best!)
	@PostMapping("/test01/ex04.do")
	public ModelAndView ex04(@RequestParam("myid") String id, @RequestParam("mypw") String pw) {

		
			return new ModelAndView("result", "myuser", new User(id, pw));
		}
	}
