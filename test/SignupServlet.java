package com.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public SignupServlet() {
        super();
          }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//아이디
		String uid= request.getParameter("id");
		
		String resid= "<html><h3>User ID: "+ uid+ "</h3></html>";
		response.getWriter().print(resid);
		//비밀번호
		String ups= request.getParameter("ps");
		
		String resps= "<html><h3>Password: "+ ups+ "</h3></html>";
		response.getWriter().print(resps);
		//이름
		String unm= request.getParameter("nm");
		
		String resnm= "<html><h3>Name: "+ unm+ "</h3></html>";
		response.getWriter().print(resnm);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
