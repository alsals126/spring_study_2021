package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	// 주소창에 직접입력하는거(value="/") => GET
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		System.out.println("home");
		return "/WEB-INF/views/index.jsp";
	}
	
	// get방식으로 /test1으로 접속했을 때 콘솔에 test1출력
	// test1.jsp 만들어서 브라우저에 test1 출력
	@RequestMapping(value="/test1", method=RequestMethod.GET)
	public String practice0601() {
		System.out.println("test1");
		return "/WEB-INF/views/test1.jsp";
	}
}
