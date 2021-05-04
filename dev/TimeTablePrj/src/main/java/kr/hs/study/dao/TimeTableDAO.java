package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.TimeTableDTO;

@Component
public class TimeTableDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private MapperClass mapper;
	
	//추가
	public void insert_data(TimeTableDTO dto) {
		String sql = "insert into timetable values(?,?,?,?)";
		jdbcTemplate.update(sql, dto.getName(), dto.getTeacher()+" 선생님", dto.getDay(), dto.getTime());
	}
	//수정
	public void update_data(TimeTableDTO dto) {
		String sql = "update timetable set name=? where teacher=?";
		jdbcTemplate.update(sql, dto.getName(), dto.getTeacher());
	}
	//삭제
	public void delete_data(TimeTableDTO dto) {
		String sql = "delete from timetable where name=?";
		jdbcTemplate.update(sql, dto.getName());
	}
	//가져오기
	public List<TimeTableDTO> select_data() {
		String sql = "select * from timetable";
		List<TimeTableDTO> list = jdbcTemplate.query(sql, mapper);
		return list;
	}
}
