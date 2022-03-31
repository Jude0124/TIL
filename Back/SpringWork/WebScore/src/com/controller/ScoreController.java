package com.controller;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.biz.ScoreBIZ;
import com.entity.ScoreEntity;
import com.vo.ScoreVO;

//requestScope
//  { "/MyServlet", "/select", "/insert", "/delete", "/update", "/find" })
@Controller
@RequestMapping("/score/*")
public class ScoreController {
    
//	컨트롤러 -> 비즈 -> 다오
	
	@Autowired
	ScoreBIZ scoreBIZ;
	
	@GetMapping("/list.do")
	public ModelAndView my_Select() {
		List<ScoreEntity> all = scoreBIZ.getAllScore();
		return new ModelAndView("listScore","all",all);
	}
	
	// 삭제를 하고 전체목록으로 이동한다.
	@RequestMapping(value="/delete.do",method=RequestMethod.GET)
	public String my_Delete(@RequestParam("del_name") String name) {
		int r = scoreBIZ.getDelScore(name);
		if(r>0) { // 삭제했으면 바로 페이지 이동.(담아서 보낼게없다. 즉 modelandview 필요없어. redirect로 하자.)
			return "redirect:/score/list.do";
		}else {
			return "score/error.jsp";
		}
	}

	// 이름으로 찾아서 updateScore.jsp로 일단 보내고, 수정값 입력 후 
	// 업데이트 서블릿으로 이동해서 실제 데이터를 DAO를 통해 업데이트가 된다.
	@RequestMapping(value="/find.do",method=RequestMethod.GET)
	public ModelAndView my_Find(@RequestParam("find_name") String name) {
		ScoreEntity r = scoreBIZ.getFindScore(name); // 한 줄로 찾아오니까 entity
		// 담아서 보내야 하니까 ModelandView
		return new ModelAndView("updateScore","find",r); // find이름으로 r을 받아서 updateScore.jsp로 간다.
	}
	
	// 수정한 내용을 받아서 가야돼.(@ModelAttribute)
	@RequestMapping(value="/update.do",method=RequestMethod.GET)
	public String my_Update(@ModelAttribute("scoreVo") ScoreVO vo) { //vo에 담아
		int r= scoreBIZ.getUpdateScore(vo);
		if(r>0) {
			return "redirect:/score/list.do";
		}else {
			return " ";
		}
	}
	
	@GetMapping("/input.do")
	public ModelAndView my_input(ModelAndView view) {
		view.setViewName("inputScore"); // WEB-INF/score/inputScore.jsp  => viewname을 만들어 줘야 넘어간다. score 밑에 숨겨놨기 때문.
		return view;
	}
	
	@PostMapping // 둘다가능
//	@RequestMapping(value="/insert.do",method=RequestMethod.POST)
	public ModelAndView register(@ModelAttribute("scoreVo") ScoreVO vo) { // 값을 받아서 넘겨야되니까 ModelAndView
		int r = scoreBIZ.getInsertScore(vo);
		if(r>0) {
			return new ModelAndView("listScore","all",scoreBIZ.getAllScore());
		}else {
			return new ModelAndView("error");
		}
	}
}




















