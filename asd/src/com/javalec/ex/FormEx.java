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
writer.println("�н� : "+path+"<br/>");
writer.println("���̵� : "+id+"<br/>");
writer.println("��й�ȣ : "+pw+"<br/>");
writer.println("�н�2 : "+path2+"<br/>");
writer.println("���̵�2 : "+id2+"<br/>");
writer.println("��й�ȣ2 : "+pw2+"<br/>");
writer.println("</body></html>");
writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("�� �⹫��");
		request.setCharacterEncoding("EUC-KR");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String[] hb = request.getParameterValues("hobby");
		String pt = request.getParameter("protocol");
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter writer = response.getWriter();
	writer.println("<html><head></head><body>");
	writer.println("�̸� : "+name+"<br/>");
	writer.println("���̵� : "+id+"<br/>");
	writer.println("��й�ȣ : "+pw+"<br/>");
	writer.println("��� : "+Arrays.toString(hb)+"<br/>");
	writer.println("�������� : "+pt+"<br/>");
	writer.println("</body></html>");
	writer.close();
	}

}
