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
      
	@GetMapping("/login.do")
	public String myview(@RequestParam("id")String id ,@RequestParam("pw")String pw) {
	    System.out.println(id +","+ pw);
		if(id.equals("abcd")  && pw.equals("1234") ) {
	    	  return "/ok";
	      }else {
	    	  return "/fail"; 
	      }    	  
	    
  }
	
	

	  @PostMapping("/test01/ex02.do")
	  public String myView01(@RequestParam("username") String userName ,HttpServletResponse  res) {
		    try {
			res.getWriter().print(userName);
		} catch (IOException e) {			
			e.printStackTrace();
		}
		    return null;
	  }

	  @PostMapping("/test01/ex03.do")
	  public @ResponseBody  String myView02(@RequestParam("myid") String id,
			  @RequestParam("mypw") String pw) {
		  String hap=null;
		  hap  =  "{id:"+ id +" , pw :"+pw+"}";
		   		    return hap;
	  }
	  
 
	  @PostMapping("/test01/ex04.do")
	  public ModelAndView  myView03(@RequestParam("myid") String id,
			  @RequestParam("mypw") String pw) {	
		 
		 return new ModelAndView("result","user",new User(id,pw));		 
	  }
	  
	  
}
