package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.biz.ScoreBiz;
import com.entity.Score;

/**
 * Servlet implementation class ScoreInput
 */

//@WebServlet("/ScoreInput")
public class ScoreInput extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
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
