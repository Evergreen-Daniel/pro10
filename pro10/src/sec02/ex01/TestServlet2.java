package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first/*")
public class TestServlet2 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
	response.setContentType("text/html;charset=utf-8");
	PrintWriter out = response.getWriter();
	String context = request.getContextPath();
	String url = request.getRequestURL().toString();
	String mapping = request.getServletPath();
	String uri = request.getRequestURI();
	out.println("<html>");
	out.println("<head>");
	out.println("<title>Test Servlet2</title>");
	out.println("</head>");
	out.println("<body bgcolor = 'yellow'>");
	out.println("<b>TestServlet2¿‘¥œ¥Ÿ");
	out.println("");
	out.println("");
	out.println("");
	out.println("");
	out.println("");
	out.println("");
	
	}

}
