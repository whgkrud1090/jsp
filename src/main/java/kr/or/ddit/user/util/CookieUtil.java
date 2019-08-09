package kr.or.ddit.user.util;

public class CookieUtil {

	public static String getCookie(String cookieString, String cookieId) {
		
		//cookieString = "remeberMe=Y; userId=brown; test=testValue";
		//cookId : brown;

		String[] cookies = cookieString.split("; ");
		//cookies[0] = "remeberMe=Y";
		//cookies[0] = "userId=brown";
		//cookies[0] = "test=testValue";
		
		for(String cookie : cookies) {
			String[] cookieNmValue = cookie.split("=");
			//cookieNmValue[0] = remeberMe
			//cookieNmValue[1] = Y
			
			if(cookieId.equals(cookieNmValue[0]))
				return cookieNmValue[1];
		}
		return null;
	}

}
