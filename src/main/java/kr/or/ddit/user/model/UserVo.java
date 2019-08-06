package kr.or.ddit.user.model;

public class UserVo {

	//사용자 이름

	private String userNm;
	private String userId;
	private String pass;

	public UserVo() {
	}
	public UserVo(String userNm) {
		this.userNm = userNm;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "UserVo [userNm=" + userNm + ", userId=" + userId + ", pass=" + pass + "]";
	}
}
