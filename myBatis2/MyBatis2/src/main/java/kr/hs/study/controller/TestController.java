package kr.hs.study.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.model.dto.LoginDTO;


@Controller
public class TestController {
	@Autowired
	SqlSessionTemplate sessionTemplate;
	
	@GetMapping("/login")
	public String login() {
		return "login_form";
	}
	@PostMapping("/login")
	public String login_re(LoginDTO dto) {
		// 1. LoginDTO 객체를 만들고    2. setter를 이용해서 값을 DI 한다.
		sessionTemplate.insert("test_db.insert_data", dto);
		
		return "result";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam String user_id) { //user_id : kim이 주입이 된다
		sessionTemplate.delete("test_db.delete1", user_id);
		
		return "result";
	}
	@GetMapping("/update")
	public String update(@RequestParam String user_id) { //user_id : kim이 주입이 된다
		sessionTemplate.update("test_db.update1", user_id);
		
		return "result";
	}
}
