package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.LoginDTO;

@Component
public class LoginDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private MapperClass mapper;
	
	//추가
	public void insert_data(LoginDTO dto) {
		String sql = "insert into book values(?,?,?,?)";
		jdbcTemplate.update(sql, dto.getBookTitle(), dto.getBookAuthor(), dto.getBookPrice(), dto.getBookEmail());
	}
	
	//수정
	public void update_data(LoginDTO dto) {
		String sql = "update book set price=? where email=?";
		jdbcTemplate.update(sql, dto.getBookPrice(), dto.getBookEmail());
	}
	
	//삭제
	public void delete_data(LoginDTO dto) {
		String sql = "delete from book where email=?";
		jdbcTemplate.update(sql, dto.getBookEmail());
	}
	
	//가져오기
	public List<LoginDTO> select_data() {
		String sql = "select * from book";
		List<LoginDTO> list = jdbcTemplate.query(sql, mapper);
		return list;
	}
}
