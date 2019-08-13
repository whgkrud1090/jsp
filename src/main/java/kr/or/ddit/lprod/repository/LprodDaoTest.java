package kr.or.ddit.lprod.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.lprod.model.LprodVo;
import kr.or.ddit.util.MybatisUtil;

public class LprodDaoTest implements ILprodDao{

	@Override
	public List<LprodVo> getLprodList() {
		SqlSession sqlsession = MybatisUtil.getSession();
		List<LprodVo> lprodList = sqlsession.selectList("lprod.getLprodList");
		sqlsession.close();

		return lprodList;
	}

}
