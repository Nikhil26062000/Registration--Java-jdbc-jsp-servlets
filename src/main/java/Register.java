
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;




import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;


import   jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import   jakarta.servlet.http.HttpServlet;
import  jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//
//public class Register extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
// 
//    public Register() {
//        // TODO Auto-generated constructor stub
//    }

	
    
    
    

@WebServlet("/Register")
public class Register extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
	   
		member member = new member(uname,password,email,phone);
	    RegDao rdao = new RegDao();
	    String result=rdao.insert(member);
	    response.getWriter().print(result); 
	}

    
    
    
    
    
    
    
    
    
    
    
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
