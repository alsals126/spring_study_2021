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
import org.springframework.web.servlet.ModelAndView;

import kr.hs.study.model.dto.MusicDTO;

@Controller
public class TestController {
	@Autowired // 스프링에서 자동주입 (설정파일에서 미리 만들어놓았다)
	SqlSessionTemplate sessionTemplate;
	
	@GetMapping("/addMusic")
	public String addMusic() {
		return "musicInsert";
	}
	@PostMapping("/addMusic")
	public String addMusic_re(MusicDTO dto) {
		sessionTemplate.insert("music.add", dto);
		
		return "confirm";
	}
	
	@GetMapping("/searchMusic")
	public String searchMusic() {
		return "musicSearch";
	}
	@PostMapping("/searchMusic")
	public String searchMusic_re(Model model, MusicDTO dto) {
		String song_title = dto.getSong_title();
		List<MusicDTO> list = sessionTemplate.selectList("music.search", song_title);
		model.addAttribute("list", list);
		
		return "musicSearchResult";
	}
	
	@GetMapping("/musicList")
	public String list(Model model) {
		List<MusicDTO> list = sessionTemplate.selectList("music.list");
		model.addAttribute("list", list);
		return "musicList";
	}
	
	@GetMapping("/updateMusic")
	public String updateMusic(Model model, @RequestParam int song_id) {
		MusicDTO dto = sessionTemplate.selectOne("music.select", song_id);
		model.addAttribute("music", dto);
		return "musicEdit";
	}
	@PostMapping("/updateMusic")
	public String updateMusic_re(MusicDTO dto, @RequestParam int song_id) {
		sessionTemplate.update("music.update", dto);
		
		return "confirm";
	}
	
	@GetMapping("/deleteMusic")
	public String deleteMusic(Model model, @RequestParam int song_id) {
		MusicDTO dto = sessionTemplate.selectOne("music.select", song_id);
		model.addAttribute("music", dto);
		return "musicDelete";
	}
	@GetMapping("/delete")
	public String deleteMusic_re(@RequestParam int song_id) {
		sessionTemplate.delete("music.delete", song_id);
		return "confirm";
	}
}
