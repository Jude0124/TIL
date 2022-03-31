package com.test02;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.*;

@WebServlet(urlPatterns={"/UsingParameters"}, 
initParams = {@WebInitParam(name = "firstName", value = "mill"),
		 @WebInitParam(name = "lastName", value = "coco")}) 
public class UsingParameters extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public UsingParameters() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String firstName = getInitParameter("firstName");

		ServletConfig configuration = getServletConfig();
		String lastName = configuration.getInitParameter("lastName");

		ServletContext context = getServletContext();
		String category = context.getInitParameter("category");

		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("Using Initialization Parameters");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Using Initialization Parameters</h1>");

		out.println("First Name: " + firstName);
		out.println("<br/>");
		out.println("Last Name: " + lastName);
		out.println("<br/>");
		out.println("Category: " + category);

		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
