package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.biz.ScoreBiz;
import com.entity.Score;

/**
 * Servlet implementation class MyController
 */
@WebServlet({ "/ScoreUpdate", "/ScoreDelete", "/ScoreFind", "/ScoreInput", "/ScoreAll" })
public class MyController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = request.getRequestURI();
		
		if (url.endsWith("ScoreAll")) {
			doScoreAll(request, response);
		} else if (url.endsWith("ScoreUpdate")) {
			doScoreUpdate(request, response);
		} else if (url.endsWith("ScoreDelete")) {
			doScoreDelete(request, response);
		} else if (url.endsWith("ScoreFind")) {
			doScoreFind(request, response);
		} else if (url.endsWith("ScoreInput")) {
			doScoreInput(request, response);
		}
	}

	protected void doScoreAll(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// db에 있는 전체 내용을 리턴 받아 jsp로 보낸다.
		// view -> controlloer -> model
		// index.html -> ScoreAll.java <-> ScoreBiz <-> ScoreDao
		// ScoreAll.jsp<-

		List<Score> all = new ScoreBiz().getScoreAll();

		// 값을 받아서 저장한 다음 ScoreAll.jsp로 전송
		request.setAttribute("all", all); // 저장

		// 전송
		RequestDispatcher rd = request.getRequestDispatcher("ScoreAll.jsp");
		rd.forward(request, response);// forward는 제어권을 넘기는 것을 의미
		// 요청은 클라이언트가 나에게 했지만 리턴은 ScoreAll.jsp에게 넘겨준다.

	}

	protected void doScoreDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int r = new ScoreBiz().getScoredelete(request.getParameter("name"));
		if (r > 0) {
			response.sendRedirect("ScoreAll");
		}
	}

	protected void doScoreFind(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 수정할 이름을 받아와서 비즈로 보낸다.
		String name = request.getParameter("name");
		Score my_score = new ScoreBiz().getScoreFind(name);
		// 담아서 출력할 ScoreUpdate.jsp로 리턴하자

		request.setAttribute("find", my_score);
		RequestDispatcher rd = request.getRequestDispatcher("ScoreUpdate.jsp");
		rd.forward(request, response);
	}

	protected void doScoreUpdate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int mat = Integer.parseInt(request.getParameter("mat"));

		Score my_score = new Score(name, kor, eng, mat);

		int r = new ScoreBiz().getScoreUpdate(my_score);

		if (r > 0) {
			response.sendRedirect("ScoreAll");
		}

	}

	protected void doScoreInput(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. ScoreInsert.html에서 입력된 값을
		// VO, Entity 인 Score에 담아서 biz로 보낸다.
		// http://localhost:8787/WebScore/ScoreInput?name=Kim&kor=90&eng=90&mat=100
		Score my_score = new Score();
		String name = request.getParameter("name");

		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int mat = Integer.parseInt(request.getParameter("mat"));

		my_score.setName(name);
		my_score.setKor(kor);
		my_score.setEng(eng);
		my_score.setMat(mat);

		// biz 호출한 다음 객체를 db로 전달해서 입력한 결과를 받는다.
		ScoreBiz biz = new ScoreBiz();

		int r = biz.getScoreInsert(my_score);
		if (r > 0) {
			response.sendRedirect("ScoreAll");
		}
	}

}
