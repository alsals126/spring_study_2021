package kr.hs.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("/joinMember")
	public String joinMember() {
		return "member/join";
	}
	@PostMapping("/joinMember")
	public String joinMember2(MemberDTO dto) {
		memberService.insert(dto);
		return "redirect:/member";
	}
	
	@GetMapping("/read")
	public String read(String studentId, Model model) {
		MemberDTO student = memberService.read(studentId);
		model.addAttribute("studentInfo", student);
		return "member/read";
	}
	@PostMapping("/member/update")
	public String update(MemberDTO dto, Model model) {
		System.out.println(dto.getUserid() + "," + dto.getPasswd());
		boolean result = memberService.check(dto.getUserid(), dto.getPasswd());
		System.out.println("result" + result);
		if(result) {
			memberService.update(dto, dto.getUserid());
			return "redirect:/member";
		}else {
			MemberDTO dto2 = memberService.read(dto.getUserid());
			model.addAttribute("studentInfo", dto);
			return "member/read";
		}
	}
}











