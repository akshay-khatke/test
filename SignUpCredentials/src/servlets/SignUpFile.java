package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.SignupBean;
import dao.SignUpdao;
@WebServlet("/signuplink")

public class SignUpFile extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw=resp.getWriter();
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String mobile=req.getParameter("mobile");
		
		//parsing
		int pass=Integer.parseInt(password);
		long mobNum=Long.parseLong(mobile);
		
		SignupBean bean=new SignupBean(name, email, pass, mobNum);
		int stutus= SignUpdao.save(bean);
		pw.print("<!DOCTYPE html>");
		pw.print("<head>");
		pw.print("<title>add student</title>");
		pw.print("<link rel='stylesheet' href='css/bootstrap.css.min'");
		
		pw.print("</head>");
		
		pw.print("<body>");
		pw.print("Student added succsesfully");
		pw.print("</body>");
		pw.print("</html>");

//RequestDispatcher rd=	req.getRequestDispatcher("loginlink");
//	rd.include(req, resp);
	
	
	}

}
