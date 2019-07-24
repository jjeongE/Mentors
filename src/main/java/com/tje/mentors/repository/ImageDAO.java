package com.tje.mentors.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tje.mentors.model.Image;

@Repository
public class ImageDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public ImageDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	class ImageRowMapper implements RowMapper<Image> {
		@Override
		public Image mapRow(ResultSet rs, int rowNum) throws SQLException {
			Image obj = new Image(
					rs.getInt(1),
					rs.getInt(2),
					rs.getString(3)
					);
			return obj;
		}
	}
	
	public Object select(int lesson_id) {
		return this.jdbcTemplate.query(
				"select * from image where lesson_id = ?", 
				new ImageRowMapper(), lesson_id);
	}
	
}
