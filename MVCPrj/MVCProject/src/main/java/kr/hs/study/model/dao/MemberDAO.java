package kr.hs.study.model.dao;

import java.util.List;

import kr.hs.study.model.dto.MemberDTO;

public interface MemberDAO {
	public List<MemberDTO> list(); //select
	public void insert(MemberDTO dto); //insert
	public MemberDTO read(String userid); //select where userid=
}
