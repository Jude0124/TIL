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

/*
 *Servlet implementation class ScoreAll
 */
//@WebServlet("/ScoreAll")
public class ScoreAll extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// db에 있는 전체 내용을 리턴 받아 jsp로 보낸다.
		// view -> controlloer -> model
		// index.html -> ScoreAll.java <-> ScoreBiz <-> ScoreDao
		// ScoreAll.jsp<-
		
		List<Score> all = new ScoreBiz().getScoreAll();
		
		//값을 받아서 저장한 다음 ScoreAll.jsp로 전송
		req.setAttribute("all", all); //저장
		
		//전송
		RequestDispatcher rd = req.getRequestDispatcher("ScoreAll.jsp");
		rd.forward(req, resp);//forward는 제어권을 넘기는 것을 의미
		//요청은 클라이언트가 나에게 했지만 리턴은 ScoreAll.jsp에게 넘겨준다.
	}
	

}
