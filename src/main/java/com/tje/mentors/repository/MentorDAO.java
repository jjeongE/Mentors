package com.tje.mentors.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tje.mentors.model.Menti;
import com.tje.mentors.model.Mentor;
import com.tje.mentors.repository.MentiDAO.mentiRowMapper;

@Repository
public class MentorDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
			
	class mentorRowMapper implements RowMapper<Mentor>{
		@Override
		public Mentor mapRow(ResultSet rs, int rowNum) throws SQLException {
			Mentor mentor = new Mentor(
					rs.getInt("mentor_id"),
					rs.getString("mentor_email"),
					rs.getString("mentor_name"),
					rs.getString("mentor_password"),
					rs.getInt("mentor_categoryBig"),
					rs.getString("mentor_profile"),//선택사항
					rs.getString("mentor_info"),//선택사항
					rs.getString("phone"),
					rs.getTimestamp("regist_date"));		
			return mentor;
		}
		
	}
	
	public int insert(Mentor model) {
		return this.jdbcTemplate.update(
				"insert into mentor values (null, ?, ?, ?, ?, null, ?, ?, now())", 
				model.getMentor_email(),
				model.getMentor_name(),
				model.getMentor_password(),
				model.getMentor_categoryBig(),
				model.getMentor_info() == "" || model.getMentor_info().length() == 0 ? null : model.getMentor_info() ,
				model.getPhone());
	}
	
	public Object selectByEmail(Mentor model){

		Mentor loginMember = null;
		
		try {
			loginMember = this.jdbcTemplate.queryForObject(
			"select * from mentor where mentor_email = ?",
			new mentorRowMapper(),
			model.getMentor_email());
			
			return loginMember;
		} catch (Exception e) {
			return null;
		}
		
	}
	
	
	public Object selectById(Mentor model){
		
		Mentor loginMember = null;
		
		try {
			loginMember = this.jdbcTemplate.queryForObject(
			"select * from mentor where mentor_id = ?",
			new mentorRowMapper(),
			model.getMentor_id());
			
			return loginMember;
			
		} catch (Exception e) {
			return null;
		}
		
	}
	

	public int updateProfile(Mentor model){
		
		return this.jdbcTemplate.update(
			"update mentor set mentor_profile = ? where mentor_id = ?",
			new mentorRowMapper(),
			model.getMentor_profile(),
			model.getMentor_id());
	}
	
	public int updateInfo(Mentor model){
		
		return this.jdbcTemplate.update(
			"update mentor set mentor_info = ? where mentor_id = ?",
			new mentorRowMapper(),
			model.getMentor_info(),
			model.getMentor_id());
	}
	
	
	public int updatePassword(Mentor model){
		
		return this.jdbcTemplate.update(
			"update mentor set mentor_password = ? where mentor_id = ?",
			new mentorRowMapper(),
			model.getMentor_password());
	}
	
	public int deleteById(Mentor model){
		
		return this.jdbcTemplate.update(
			"delete from mentor where mentor_id = ?",
			new mentorRowMapper(),
			model.getMentor_id());
			
	}
	

	
}
