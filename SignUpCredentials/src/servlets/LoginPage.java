package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SignUpdao;
@WebServlet("/loginlink")
public class LoginPage extends HttpServlet
{
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
        PrintWriter pw=resp.getWriter();
        
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        //parsing
        
        int password1=Integer.parseInt(password);
        
     if(SignUpdao.verify(username, password1)) {
    	 pw.print("<h1>login succusefull!!!!!!</h1>");
            
     }
     else {
    	 pw.print("<h1 style='color:red'>invalid username or password</h1>");
 RequestDispatcher rd=req.getRequestDispatcher("loginpage.html");
 rd.include(req, resp);
     
     }
     
     
     
     }
	
	
	
	
	
	
}
