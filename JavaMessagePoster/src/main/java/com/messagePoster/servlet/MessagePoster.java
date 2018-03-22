package com.messagePoster.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/messagePosterServlet")
public class MessagePoster extends HttpServlet {

	private static final long serialVersionUID = 1L;

	// This Method Is Called By The Servlet Container To Process A 'POST' Request.
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		handleRequest(req, resp);
	}

	public void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		resp.setContentType("text/html");

		// Post Parameters From The Request
		String param1 = req.getParameter("name");
		String param2 = req.getParameter("message");

		if(param1 == null || param2 == null) {
			// The Request Parameters Were Not Present In The Query String. Do Something 
		} else if ("".equals(param1) || "".equals(param2)) {
			// The Request Parameters Were Present In The Query String But Has No Value. 
		} else {
			System.out.println("name?= " + param1 + ", message?= " + param2);

			// Print The Response
			PrintWriter out = resp.getWriter();
			out.write("<html><body><div id='serlvetResponse' style='text-align: center;'>");

			// building The Html Response Code
			if((param1.equalsIgnoreCase("Order")) && (param2.equals("yes"))) {				
				out.write("<h2>Message Poster</h2>");
				out.write("<p style='color: green; font-size: large;'>Congrats! <span style='text-transform: capitalize;'>" + param1 + "</span>, You are good in getting Response!</p>");				
			} else {
				out.write("<p style='color: red; font-size: larger;'>You are a bad programmer!</p>");				
			}
			out.write("</div></body></html>");
			out.close();
		}
	}
}