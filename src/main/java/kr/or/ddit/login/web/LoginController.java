package kr.or.ddit.login.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.user.model.UserVo;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	/**
	* Method : doGet
	* 작성자 : PC-03
	* 변경이력 :
	* @param request
	* @param response
	* @throws ServletException
	* @throws IOException
	* Method 설명 : 로그인 화면 요청 처리(forward처리)
	*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//webapp/jsp/login.jsp --> jsp/login.jsp
		request.getRequestDispatcher("/login/login.jsp").forward(request, response);
	}

	/**
	* Method : doPost
	* 작성자 : PC-03
	* 변경이력 :
	* @param request
	* @param response
	* @throws ServletException
	* @throws IOException
	* Method 설명 :로그인 요청처리
	*/
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.debug("login controller doPost()");
		//userId, password 파라미터 logger출력
		String userId = request.getParameter("userId");
		String pass = request.getParameter("pass");
		
		logger.debug("userId {}", userId);
		logger.debug("pass {}", pass);
		
		//사용자가 입력한 계정정보와 db에 있는 값 비교
		UserVo userVo = new UserVo();
		userVo.setUserNm("브라운");
		userVo.setUserId("brown");
		userVo.setPass("brown1234");
		
		//사용자가 입력한 파라미터 정보와 db에서 조회해온 값이 동일할 경우
		//		--> webapp/mein.jsp
		
		//사용자가 입력한 파라미터 정보와 db에서 조회해온 값이 동일하지 않을 경우
		//		-->webapp/login/login.jsp
		
		if(userId.equals(userVo.getUserId()) && pass.equals(userVo.getPass())) {
			
			HttpSession session = request.getSession();
			logger.debug("session.getId() : {}", session.getId());
			session.setAttribute("S_USERVO", userVo);
			
			request.getRequestDispatcher("/main.jsp").forward(request, response);
		}else {
			//forward의 경우 request, response객체를 공유
			//request method도 같이 공유
			//doPost()
			request.setAttribute("userId", userId);
			doGet(request, response);
		}
	}

}
