package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.hs.study.model.dto.LoginDTO;
import kr.hs.study.model.dto.AbcDTO;

@Controller
public class TestController {
   @GetMapping("/test1")
   public String test1() {
      return "test1";
   }
   @GetMapping("/test2")
   public String test2(Model model) {
	   model.addAttribute("id", "kim");
	   model.addAttribute("password", "1111");
      return "test2";
   }
   @GetMapping("/test3")
   public String test3() {
	   return "login_form";
   }
   @PostMapping("/test3")
   public String test3_(LoginDTO dto, Model model) {
	   model.addAttribute("id", dto.getId());
	   model.addAttribute("pw", dto.getPw());
	   model.addAttribute("email", dto.getEmail());
	   return "login_result";
   }
   @GetMapping("test4")
   public ModelAndView test4(ModelAndView mv) {
	   mv.addObject("id", "lee");
	   mv.addObject("password", "1111");
	   mv.addObject("email", "lee@gamil.com");
	   // view이름까지 지정해줘야 돼
	   mv.setViewName("test4");
	   return mv;
   }
   // 객체에 담긴 값을 model에 담아서 view로 넘김
   @GetMapping("test5")
   public String test5(AbcDTO dto, Model model) { //스프링이 자동으로 AbcDTO 객체를 만들어준다.
	   model.addAttribute("a", dto.getA());
	   model.addAttribute("b", dto.getB());
	   model.addAttribute("c", dto.getC());
	   return "test5";
   }
   // 객체에 담긴 값을 바로 view로 넘김
   @GetMapping("test6")
   public String test6(@ModelAttribute AbcDTO dto) { // abcDTO가 객체 이름
	   return "test6";
   }
   @GetMapping("test7")
   public String test7(@ModelAttribute("sample") AbcDTO dto) { // abcDTO가 객체 이름
	   return "test7";
   }
}