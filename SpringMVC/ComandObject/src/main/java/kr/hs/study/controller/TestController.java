package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.LoginDTO;
import kr.hs.study.model.ModelDTO;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1(ModelDTO dto) { //@ModelAttribute 생략가능
		System.out.println(dto.getA());
		System.out.println(dto.getB());
		System.out.println(dto.getC());
		return "result";
	}
	
	@GetMapping("/test2")
	public String test2_1() {
		return "login";
	}
	@PostMapping("/test2")
	public String test2_2(LoginDTO dto) {
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
		return "result";
	}
	
	@GetMapping("/test3")
	public String test3(ModelDTO dto) {
		System.out.println("a> " + dto.getA());
		System.out.println("b> " + dto.getB());
		for(int value: dto.getCc())
			System.out.println("c> " + value);
		return "result";
	}
}
