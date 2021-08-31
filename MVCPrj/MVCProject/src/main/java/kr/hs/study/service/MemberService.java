package kr.hs.study.service;

import java.util.List;

import kr.hs.study.model.dto.MemberDTO;

// 인터페이스는 상수랑 추상메서드로 이루어진다.
public interface MemberService {
	public List<MemberDTO> list(); //select
	public void insert(MemberDTO dto); //insert
	public MemberDTO read(String userid); //select where userid=
	public boolean check(String userid, String passwd);
	public void update(MemberDTO dto, String userid);
}