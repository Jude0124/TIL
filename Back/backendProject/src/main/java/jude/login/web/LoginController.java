package jude.login.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
	
	@GetMapping("/user/login")
	public String myview(@RequestParam("id")String id ,@RequestParam("pw")String pw) {
	    System.out.println(id +","+ pw);
		if(id.equals("abcd")  && pw.equals("1234") ) {
	    	  return "/ok";
	      }else {
	    	  return "/fail"; 
	      }    	  
	    
  }
}
