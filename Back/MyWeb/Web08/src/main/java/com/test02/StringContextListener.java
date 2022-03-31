package com.test02;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class StringContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("StringContextListener 종료 되었습니다");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		ServletContext ctx = arg0.getServletContext();
		Address ar = new Address("Dominico", "seoul", "77-7777");
		ctx.setAttribute("address", ar);
		System.out.println("StringContextListener 초기회 되었습니다.");
	}

}
