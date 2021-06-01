package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@RequestMapping(value="/sub1/test2", method=RequestMethod.GET)
	public String test2() {
		System.out.println("/sub1/test2");
		return "/WEB-INF/views/sub1/test2.jsp";
	}
	@RequestMapping(value="/sub1/test3", method=RequestMethod.GET)
	public String test3() {
		System.out.println("/sub1/test3");
		//상대경로 : 현재 나의 위치 => /sub1/WEB-INF/views/sub1/..
		//return "WEB-INF/views/sub1/test3.jsp";
		//절대경로 : 루트(webapp)부터 시작 => webapp/WEB-INF/..
		return "/WEB-INF/views/sub1/test3.jsp";
	}
	@RequestMapping(value="/sub1/test4", method=RequestMethod.GET)
	public String test4() {
		return "/WEB-INF/views/sub1/test4.jsp";
	}
}
