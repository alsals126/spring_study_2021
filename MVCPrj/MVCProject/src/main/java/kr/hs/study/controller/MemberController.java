package kr.hs.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.hs.study.model.dto.MemberDTO;
import kr.hs.study.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@GetMapping("/member")
	public String list(Model model) {
		List<MemberDTO> list1 = memberService.list();
		System.out.println(list1);
		model.addAttribute("list1", list1);
		return "member/list";
	}
}
