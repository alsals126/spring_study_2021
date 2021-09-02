package kr.hs.study.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		sqlsessiontemplate.insert("member.insert",dto);
	}

	public MemberDTO read(String userid) {
		// TODO Auto-generated method stub
		return sqlsessiontemplate.selectOne("member.read", userid);
	}

	public boolean check(String userid, String passwd) {
		boolean result = false;
		Map<String,String> map = new HashMap<String,String>(); //userid랑 passwd를 같이 넣을 수 없어서 map으로 묶는다.
		map.put("userid", userid);							   //sqlsessiontemplate.selectOne("member.check", userid, passwd) => 안됨
		map.put("passwd", passwd);
		
		
		int count = sqlsessiontemplate.selectOne("member.check", map);
		if(count==1)
			result = true;
		return false;
	}

	public void update(MemberDTO dto, String userid) {
		// TODO Auto-generated method stub
		
	}

}