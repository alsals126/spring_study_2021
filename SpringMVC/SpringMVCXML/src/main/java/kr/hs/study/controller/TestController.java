package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
// 클래스 앞에 RequestMapping을 붙이면 무조건 /sub1이 붙는다.
// 이걸 빼면 @RequestMapping(value="/sub1/test2", ...)로 써야해서 코드반복이 된다.
@RequestMapping("/sub1")
public class TestController {
	@GetMapping("/test2") // == @RequestMapping(value="/test2", method=RequestMethod.GET)
	public String test2() {
		System.out.println("/sub1/test2");
		//return "/WEB-INF/views/sub1/test2.jsp";
		return "/sub1/test2";
	}
	@RequestMapping(value="/test3", method= {RequestMethod.GET, RequestMethod.POST})
	public String test3() {
		System.out.println("/sub1/test3");
		//상대경로 : 현재 나의 위치 => /sub1/WEB-INF/views/sub1/..
		//return "WEB-INF/views/sub1/test3.jsp";
		//절대경로 : 루트(webapp)부터 시작 => webapp/WEB-INF/..
		//return "/WEB-INF/views/sub1/test3.jsp";
		return "sub1/test3";
	}
	@RequestMapping(value="/test4", method=RequestMethod.GET)
	public String test4() {
		//return "/WEB-INF/views/sub1/test4.jsp";
		//return "test4";  => 상대경로 : 현재 나의 위치를 기준으로 잡음. => WEB-INF/views/test4.jsp
		return "/sub1/test4"; // 절대경로 : /WEB-INF/views가 루트
	}
}
