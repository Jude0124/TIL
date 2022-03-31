package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.biz.ScoreBiz;
import com.entity.Score;

/**
 * Servlet implementation class ScoreFind
 */
//@WebServlet("/ScoreFind")
public class ScoreFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 수정할 이름을 받아와서 비즈로 보낸다.
		String name = request.getParameter("name");
		Score my_score = new ScoreBiz().getScoreFind(name);
		//담아서 출력할 ScoreUpdate.jsp로 리턴하자
		
			request.setAttribute("find", my_score);
			RequestDispatcher rd = request.getRequestDispatcher("ScoreUpdate.jsp");
			rd.forward(request, response);
	}
}
