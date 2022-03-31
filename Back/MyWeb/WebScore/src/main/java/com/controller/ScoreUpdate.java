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
 * Servlet implementation class ScoreUpdate
 */
//@WebServlet("/ScoreUpdate")
public class ScoreUpdate extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name =request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int mat = Integer.parseInt(request.getParameter("mat"));
	
		Score my_score = new Score(name,kor,eng,mat);
		
		int r = new ScoreBiz().getScoreUpdate(my_score);
		
		if(r>0)
		{
			response.sendRedirect("ScoreAll");
		}
	}


}
