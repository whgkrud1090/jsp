package kr.or.ddit.user.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.user.model.User;
import kr.or.ddit.user.repository.UserDao;

@WebServlet("/userList")
public class UserListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * - doGet()
		 * 	UserDao 사용자 리스트 조회
		 * 	request객테에 사용자 리스트 정보 저장
		 * 	userList.jsp를 통해서 화면응답을 생성하도록 위임
		 */
		
		UserDao userDao = new UserDao();
		List<User> userList = userDao.getUserList();
		
		request.setAttribute("userList", userList);
		
		request.getRequestDispatcher("/user/userList.jsp").forward(request, response);
	}
}
