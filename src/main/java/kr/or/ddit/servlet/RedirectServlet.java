package kr.or.ddit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * web.xml <servlet></servlet>, <servlet-name></servlet-name>설정을 
 * @WebServlet을 통해 대체
 */
@WebServlet("/redirectServlet")
public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//localhost:8081/redirectServle get => doGet 호출
	//웹 브라우저 주소줄에 url을 입력하고 엔터를 입력하면 get방식 요청
	
	//redirectForm.jsp에 응답 생성을 위임
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//print writer객체를 이용해 html코드를 직접 작성하는 것이 아니라
		//화면을 생성하는 jsp에게 요청을 위임
		
		//서버가 켜져있는 상태에서 새servlet을 생성했을때 서버를 재 실행 해주어야한다.
		
		//dispatch방식으로 위임
		//context path를 적어주지 않는다.
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/redirectForm.jsp");	
		rd.forward(request, response);
	}

	//localhost:8081/redirectServlet post=> doPost호출
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//login 화면으로 redirect
		//메소드 인자로 웹브라우저 주소 줄에 입력할 url을 작성해준다.
		//context p[ath가 root가 아니면 context path도 같이해주어야 한다.
		
		response.sendRedirect(request.getContextPath() + "/jsp/login.jsp");
	}

}
