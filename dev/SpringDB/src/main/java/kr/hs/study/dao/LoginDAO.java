package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.LoginDTO;

@Component
public class LoginDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//축
	public void insert_date(LoginDTO dto) {
		String sql = "insert into login values(?,?)";
		jdbcTemplate.update(sql, dto.getUserid(), dto.getUserpass());
	}
}
