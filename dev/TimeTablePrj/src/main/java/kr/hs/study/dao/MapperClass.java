package kr.hs.study.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.TimeTableDTO;

@Component
public class MapperClass implements RowMapper<TimeTableDTO>{

	public TimeTableDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		TimeTableDTO bean = new TimeTableDTO();
		bean.setName(rs.getString("name"));
		bean.setTeacher(rs.getString("teacher"));
		bean.setDay(rs.getString("day"));
		bean.setTime(rs.getInt("time"));
		return bean;
	}

}
