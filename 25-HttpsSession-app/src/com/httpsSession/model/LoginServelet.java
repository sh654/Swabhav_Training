package com.httpsSession.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServelet
 */
@WebServlet("/LoginServelet")
public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		HttpSession session = request.getSession();
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		if(email.equals("shivampdh2105@gmail.com") && password.equals("admin#123")) {
			session.setAttribute("email", email);
			response.sendRedirect("welcome.jsp?name=" +email);
			
		} else if(email.equals("shivampdh2105@gmail.com")){
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			writer.println("<font color=red> Password is Wrong.<font>");
			rd.include(request, response);
		} else if(password.equals("admin#123")) {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			writer.println("<font color=red> Email is Wrong");
			rd.include(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			writer.println("<font color=red> Both is Wrong");
			rd.include(request, response);
		}
		
		writer.close();
	}

}
