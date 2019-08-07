package kr.or.ddit.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/scopeTest")
public class ScopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/jsp/scopeTestView.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String reqParam = request.getParameter("reqParam");
		String sessionParam = request.getParameter("sessionParam");
		String applicationAttr = request.getParameter("applicationParam");
		
		// 각 영역에 값을 저장한다.
		//request
		request.setAttribute("reqAttr", reqParam + "_ATTR");
		
		//session
		HttpSession session = request.getSession();
		session.setAttribute("sessionAttr", sessionParam + "_ATTR");
		
		//application(ServletContext)
		//방법1 request.getServletContext();
		//방법2 getServletContext();

		ServletContext application = request.getServletContext();
		application.setAttribute("applicationAttr", applicationAttr + "_ATTR");
		
		//출력할 수 있는 화면으로 이동
		request.getRequestDispatcher("/jsp/scopeResult.jsp").forward(request, response);
	}

}
