package kr.hs.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.study.model.dao.MemberDAO;
import kr.hs.study.model.dto.MemberDTO;

@Service //객체 만들기 위해서 붙인다.
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO dao;
	
	public List<MemberDTO> list() {
		List<MemberDTO> dao1 = dao.list();
		return dao1;
	}

	public void insert(MemberDTO dto) {
		
	}

	public MemberDTO read(String userid) {
		MemberDTO dao1 = dao.read(userid);
		return dao1;
	}

	public boolean check(String userid, String passwd) {
		// TODO Auto-generated method stub
		return dao.check(userid, passwd);
	}

	public void update(MemberDTO dto, String userid) {
		// TODO Auto-generated method stub
		
	}

}
