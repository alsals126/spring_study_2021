package kr.hs.study.controller;

import java.net.http.HttpResponse;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.ReactiveAdapter;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.FormDTO;

@Controller
public class TestController {
	@GetMapping("/form")
	public String form1() {
		return "form";
	}
	
	@PostMapping("/form")
	public String form2(FormDTO f, Model model) {
		model.addAttribute("userName", f.getUserName());
		model.addAttribute("userKor", f.getUserKor());
		model.addAttribute("userEng", f.getUserEng());
		model.addAttribute("userMath", f.getUserMath());
		
		int sum = Integer.parseInt(f.getUserKor()) + Integer.parseInt(f.getUserEng()) + Integer.parseInt(f.getUserMath());
		int avg = sum/3;
		
		model.addAttribute("userSum", sum);
		model.addAttribute("userAvg", avg);
		return "result";
	}
}
