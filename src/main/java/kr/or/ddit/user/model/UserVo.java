package kr.or.ddit.user.model;

public class UserVo {

	//사용자 이름
	private String userName;

	public UserVo(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "UserVo [userName=" + userName + "]";
	}
}
