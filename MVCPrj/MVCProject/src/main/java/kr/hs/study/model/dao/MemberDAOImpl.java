package kr.hs.study.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.study.model.dto.MemberDTO;

@Repository //@Component라고 해도 되지만, 의미를 정확하게 하기 위해서 @Repository로 저장한다.
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	SqlSessionTemplate sqlsessiontemplate;
	
	public List<MemberDTO> list() {
		// TODO Auto-generated method stub
		return sqlsessiontemplate.selectList("member.list");
	}

	public void insert(MemberDTO dto) {
		// TODO Auto-generated method stub

	}

	public MemberDTO read(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

}