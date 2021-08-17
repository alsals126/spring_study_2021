package kr.hs.study.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.model.dto.BookDTO;
import kr.hs.study.model.dto.LoginDTO;


@Controller
public class TestController {
	@Autowired // 스프링에서 자동주입 (설정파일에서 미리 만들어놓았다)
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
	public String update(@RequestParam String user_id) {
		sessionTemplate.update("test_db.update1", user_id);
		
		return "result";
	}
	
	@GetMapping("/book")
	public String book() {
		return "book_form";
	}
	//DTO에 저장
	@PostMapping("/book")
	public String book_re(@ModelAttribute BookDTO dto) { //@ModelAttribute 생략 가능
		// 1) BookDTO의 객체가 생성 (내부적으로 new 연산자를 이용해서)
		// 2) 사용자가 입력한 값을 자동으로 book객체에 DI시킴.
		sessionTemplate.insert("book.add", dto);
		return "result";
	}
	@GetMapping("/bookDel")
	public String bookDel(@RequestParam String title) {
		sessionTemplate.delete("book.delete", title);
		return "result";
	}
	@GetMapping("/bookList")
	public String bookList(Model model) {
		List<BookDTO> list = sessionTemplate.selectList("book.list");
		model.addAllAttributes("list", list);
		return "result2";
	}
}
