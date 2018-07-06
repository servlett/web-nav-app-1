package com.monami.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AboutUsServlet
 */
public class AboutUsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AboutUsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String jobType = request.getParameter("jobType");
		String city = request.getParameter("city");

		System.out.println(jobType + "--" + city);

		if (city != null) {
			RequestDispatcher rd = request.getRequestDispatcher("about-us.jsp");

			rd.forward(request, response);
		} else {
			System.out.println("go to index");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");

			rd.forward(request, response);
		}
	}

}
