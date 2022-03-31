package com.work;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.vo.User;

@Controller
public class MyController {

	@PostMapping("/login.do")
	public @ResponseBody String myView(@RequestParam("myid") String id, @RequestParam("mypw") String pw) {
		if (id.equals("abcd") && pw.equals("1234")) {
			return "ok"; // viewName
		} else {
			return "fail"; // viewName
		}

	}

}
