package com.john.helloworld;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.john.common.ConstantString;

@WebServlet(name="Test",urlPatterns={"/test","/test2"})
public class Test extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println(ConstantString.DocType + "<HTML>\n"
				+ "<HEAD><TITLE>HELLO TEST</TITLE></HEAD>\n"
				+ "<BODY BGCOLOR=\"#FDF5E6\"><H1>HELLO TEST</H1></BODY>\n"
				+ "</HTML>");
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
