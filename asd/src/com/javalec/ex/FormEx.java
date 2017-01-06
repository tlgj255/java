package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormEx
 */
@WebServlet(urlPatterns={"/FormEx"},initParams={@WebInitParam(name="id",value="aaaa"),@WebInitParam(name="pw",value="saaaa"),@WebInitParam(name="path",value="qaaaa")})
public class FormEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
		String id2 = getServletContext().getInitParameter("id");
		String pw2 = getServletContext().getInitParameter("pw");
		String path2 = getServletContext().getInitParameter("path");
	String id = getInitParameter("id");
	String pw = getInitParameter("pw");
	String path = getInitParameter("path");
	response.setContentType("text/html; charset=euc-kr");
	PrintWriter writer = response.getWriter();
writer.println("<html><head></head><body>");
writer.println("패스 : "+path+"<br/>");
writer.println("아이디 : "+id+"<br/>");
writer.println("비밀번호 : "+pw+"<br/>");
writer.println("패스2 : "+path2+"<br/>");
writer.println("아이디2 : "+id2+"<br/>");
writer.println("비밀번호2 : "+pw2+"<br/>");
writer.println("</body></html>");
writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("앙 기무띠");
		request.setCharacterEncoding("EUC-KR");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String[] hb = request.getParameterValues("hobby");
		String pt = request.getParameter("protocol");
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter writer = response.getWriter();
	writer.println("<html><head></head><body>");
	writer.println("이름 : "+name+"<br/>");
	writer.println("아이디 : "+id+"<br/>");
	writer.println("비밀번호 : "+pw+"<br/>");
	writer.println("취미 : "+Arrays.toString(hb)+"<br/>");
	writer.println("프로토콜 : "+pt+"<br/>");
	writer.println("</body></html>");
	writer.close();
	}

}
