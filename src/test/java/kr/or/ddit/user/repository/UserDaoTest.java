package kr.or.ddit.user.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import kr.or.ddit.user.model.UserVo;

public class UserDaoTest {

	/**
	* Method : getUserListtest
	* 작성자 : PC-03
	* 변경이력 :
	* Method 설명 : getUserList 테스트
	 */
	@Test
	public void getUserListtest() {
		/***Given***/
		IUserDao userDao = new UserDao();

		/***When***/
		List<UserVo> userList = userDao.getUserList();
		
		/***Then***/
		assertEquals(5, userList.size());
	}
	
	/**
	* Method : getUser
	* 작성자 : PC-03
	* 변경이력 :
	* Method 설명 : 사용자 정보 조회 테스트
	*/
	@Test
	public void getUser() {
		/***Given***/
		String userId = "brown";
		IUserDao userDao = new UserDao();

		/***When***/
		UserVo userVo = userDao.getUser(userId);

		/***Then***/
		assertEquals("brown", userVo.getUserId());
		assertEquals("brown1234", userVo.getPass());
	}

}
