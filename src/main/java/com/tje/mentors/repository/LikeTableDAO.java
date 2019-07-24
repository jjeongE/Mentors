package com.tje.mentors.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.tje.mentors.model.*;

@Repository
public class LikeTableDAO {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public LikeTableDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	class LikeTableRowMapper implements RowMapper<LikeTable> {
		@Override
		public LikeTable mapRow(ResultSet rs, int rowNum) throws SQLException {
			LikeTable obj = new LikeTable(
					rs.getInt(1), 
					rs.getInt(2), 
					rs.getInt(3));
			return obj;
		}
	}
	
	public Object isexistLike(int menti_id, int lesson_id) {
		
		try {
			return jdbcTemplate.queryForObject("select * from like_table where menti_id = ?, lesson_id = ?", 
									new LikeTableRowMapper(),
									menti_id, lesson_id
									);
		} catch(Exception e) {
			return null;
		}
	}
	
	public int insert(LikeTable target) {
		return jdbcTemplate.update("insert into like_table values(0, ?, ?)", target.getLesson_id(), target.getMenti_id());
	}
	
	public int delete(LikeTable target) {
		return jdbcTemplate.update("delete from like_table where lesson_id = ?, menti_id = ?", target.getLesson_id(), target.getMenti_id());		
	}
}
