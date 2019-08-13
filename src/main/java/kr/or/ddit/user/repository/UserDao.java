package kr.or.ddit.user.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.user.model.User;
import kr.or.ddit.util.MybatisUtil;

public class UserDao implements IUserDao{

	/**
	 * 
	* Method : getUserList
	* 작성자 : PC-03
	* 변경이력 :
	* @return
	* Method 설명 : 사용자 전체 리스트 조회
	 */
	@Override
	public List<User> getUserList() {
		
		//db에서 조회가 되었다 가정하고 가짜 객체를 리턴
		/*List<UserVo> userList = new ArrayList<UserVo>();
		userList.add(new UserVo("brown"));
		userList.add(new UserVo("cony"));
		userList.add(new UserVo("sally"));
		userList.add(new UserVo("moon"));
		userList.add(new UserVo("james"));
		*/
		
		SqlSession sqlsession = MybatisUtil.getSession();
		List<User> userList = sqlsession.selectList("user.getUserList");
		sqlsession.close();

		return userList;		
	}

	/** 
	* Method : getUser
	* 작성자 : PC-03
	* 변경이력 :
	* @param userId
	* @return
	* Method 설명 : userId를 갖는 사용자 정보 조회
	 */
	@Override
	public User getUser(String userId) {
		SqlSession sqlsession = MybatisUtil.getSession();
		User userVo = sqlsession.selectOne("user.getUser", userId);
		sqlsession.close();
		return userVo;
	}

	@Override
	public List<User> getUserListHalf() {
		SqlSession sqlsession = MybatisUtil.getSession();
		List<User> userList = sqlsession.selectList("user.getUserListHalf");
		sqlsession.close();

		return userList;	
	}
	

}
