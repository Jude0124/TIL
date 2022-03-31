package com.test02;

import java.io.*;

import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(urlPatterns = "/logres.jsp", initParams = @WebInitParam(name = "logfile", value = "log.txt"))
public class LogFilter implements Filter {

	private FilterConfig filterconfig = null;
	private String logFile = null;
	BufferedWriter f = null;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		try {
			f = new BufferedWriter(new FileWriter(logFile, true));

			System.out.println(f.toString());
			f.write("로그 아웃 시간 =" + new Date().toString());
			f.flush();
			f.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.filterconfig = null;

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {

		arg2.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

		this.filterconfig = arg0;
		this.logFile = filterconfig.getInitParameter("logfile");
		try {
			f = new BufferedWriter(new FileWriter(logFile, true));

			System.out.println(f.toString());
			f.write("접속한 시간 =" + new Date().toString());
			f.flush();
			f.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
