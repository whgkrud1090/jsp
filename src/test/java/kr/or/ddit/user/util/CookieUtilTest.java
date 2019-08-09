package kr.or.ddit.user.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class CookieUtilTest {
	/**
	 * 
	* Method : getCookisTes
	* 작성자 : PC-03
	* 변경이력 :
	* Method 설명 : 쿠키 가져오기 테스트
	 */
	@Test
	public void getCookisTes() {
		
		//미리 테스트 코드를 작성하고 작업을 시작하는 방식
		
		/***Given***/
		//쿠키 이름 = 쿠키 값 + 구분자
		
		String cookieString = "rememberMe=Y; userId=brown; test=testValue";

		/***When***/
		String userIdCookieValue = CookieUtil.getCookie(cookieString, "userId");
		String remeberMeCookieValue = CookieUtil.getCookie(cookieString, "rememberMe");
		String testCookieValue = CookieUtil.getCookie(cookieString, "test");
		String notExistsCookieValue = CookieUtil.getCookie(cookieString, "notExists");

		/***Then***/
		assertEquals("brown", userIdCookieValue);
		assertEquals("Y", remeberMeCookieValue);
		assertEquals("testValue", testCookieValue);
		assertNull(notExistsCookieValue);
	}
}
