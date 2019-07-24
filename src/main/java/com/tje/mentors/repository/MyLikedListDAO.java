package com.tje.mentors.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tje.mentors.model.*;

@Repository
public class MyLikedListDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MyLikedListDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	class MyLikedListRowMapper implements RowMapper<MyLikedList> {
		@Override
		public MyLikedList mapRow(ResultSet rs, int rowNum) throws SQLException {
			MyLikedList obj = new MyLikedList(
					rs.getInt(1), 
					rs.getInt(2), 
					rs.getInt(3),
					rs.getString(4),
					rs.getString(5),
					rs.getString(6),
					rs.getString(7),
					rs.getDouble(8),
					rs.getInt(9)
					);
			return obj;
		}
	}
	
	public Object selectAll(int menti_id) {
		List<MyLikedList> result = jdbcTemplate.query(
				"select * from MyLikedList where menti_id = ? order by like_id desc;", 
				new MyLikedListRowMapper(), menti_id);
		
		return result;
	}
}
