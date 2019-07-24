package com.tje.mentors.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tje.mentors.model.Menti;
import com.tje.mentors.model.Mentor;

@Repository
public class MentiDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
			
	class mentiRowMapper implements RowMapper<Menti>{
		@Override
		public Menti mapRow(ResultSet rs, int rowNum) throws SQLException {
			Menti menti = new Menti(
					rs.getInt("menti_id"),
					rs.getString("menti_email"),
					rs.getString("menti_name"),
					rs.getString("menti_password"),
					rs.getString("menti_profile"),//선택사항
					rs.getString("simple_login_CK"),//선택사항
					rs.getTimestamp("regist_date"));		
			return menti;
		}
		
	}
	
	public int insert(Menti model) {
		return this.jdbcTemplate.update(
				"insert into menti values (null, ?, ?, ?, ?, ?, now())", 
				model.getMenti_email(),
				model.getMenti_name(),
				model.getMenti_password() == "" || model.getMenti_password().length() == 0 ? null : model.getMenti_password() ,
				model.getSimple_login_CK());
	}
	
	public Object selectByEmail(Menti model){
		
		Menti loginMember = null;
		
		try {
			loginMember = this.jdbcTemplate.queryForObject(
			"select * from menti where menti_email = ?",
			new mentiRowMapper(),
			model.getMenti_email());
			
			return loginMember;
		} catch (Exception e) {
			return null;
		}
		
	}
	
	
	public Object selectById(Menti model){
		
		Menti loginMember = null;
		
		try {
			loginMember = this.jdbcTemplate.queryForObject(
			"select * from menti where menti_id = ?",
			new mentiRowMapper(),
			model.getMenti_id());
			
			return loginMember;
		} catch (Exception e) {
			return null;
		}
		
	}
	
	public int updatePassword(Menti model){
		
		return this.jdbcTemplate.update(
			"update menti set menti_password = ? where menti_id = ?",
			new mentiRowMapper(),
			model.getMenti_password());
	}
	
	public int updateProfile(Menti model){
		
		return this.jdbcTemplate.update(
			"update menti set menti_profile = ? where menti_id = ?",
			new mentiRowMapper(),
			model.getMenti_profile());
	}
	
	public int deleteById(Menti model){
		
		return this.jdbcTemplate.update(
			"delete from menti where menti_id = ?",
			new mentiRowMapper(),
			model.getMenti_id());
	}
	
		
}
