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
public class MentiWhoLikesMeDAO {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MentiWhoLikesMeDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	class MentiWhoLikesMeRowMapper implements RowMapper<MentiWhoLikesMe> {
		@Override
		public MentiWhoLikesMe mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			MentiWhoLikesMe obj = new MentiWhoLikesMe(
					rs.getInt(1), rs.getInt(2), rs.getInt(3), 
					rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
			
			return obj;
		}
	}
	
	public Object select(Mentor mentor) {
		return this.jdbcTemplate.query(
				"select * from MentiWhoLikesMe where mentor_id = ?",
				new MentiWhoLikesMeRowMapper(), mentor.getMentor_id());
	}
}
