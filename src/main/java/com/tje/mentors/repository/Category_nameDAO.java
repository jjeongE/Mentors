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
public class Category_nameDAO {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public Category_nameDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	class CategoryNameRowMapper implements RowMapper<Category_name> {
		@Override
		public Category_name mapRow(ResultSet rs, int rowNum) throws SQLException {
			Category_name obj = new Category_name(
					rs.getInt(1), 
					rs.getString(2), 
					rs.getString(3));
			return obj;
		}
	}
	
	public Object selectByCategoryID(int category_id) {
		
		try {
			return this.jdbcTemplate.queryForObject(
					"select * from CATEGORY_NAME where category_id = ?", 
					new CategoryNameRowMapper(), category_id);
		}catch(Exception e) {
			return null;
		}
	}
	
	public Object selectByCategoryBig(String big) {
		return null;
	}
	
	public Object selectByCategorySmall(String small) {
		return null;
	}
}
