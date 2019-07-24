package com.tje.mentors.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tje.mentors.model.RequestChat;

@Repository
public class RequestChatDAO {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public RequestChatDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	class RequestChatRowMapper implements RowMapper<RequestChat> {

		@Override
		public RequestChat mapRow(ResultSet rs, int rowNum) throws SQLException {
			RequestChat requestChat = new RequestChat(rs.getInt("chat_id"), rs.getInt("menti_id"),
					rs.getInt("mentor_id"));
			return requestChat;
		}
	}

	public Object selectById(RequestChat requestChat) {
		String query = "select * from request_chat where chat_id = ?";		
		try {
			return this.jdbcTemplate.queryForObject(query, new RequestChatRowMapper(), requestChat.getChat_id());
		} catch (DataAccessException e) {
			e.printStackTrace();
			return null;			
		}
	}
	
	public Object selectByMenti(RequestChat requestChat) {
		String query = "select * from request_chat where menti_id = ?";
		return this.jdbcTemplate.query(query, new RequestChatRowMapper(), requestChat.getMenti_id());
	}
	
	
	public Object selectByMentiAndMentor(RequestChat requestChat) {
		String query = "select * from request_chat where menti_id = ? and mentor_id = ?";
		try {
			return this.jdbcTemplate.queryForObject(query, new RequestChatRowMapper(), requestChat.getMenti_id(), requestChat.getMentor_id());
		} catch (DataAccessException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// 게시글 상세보기에서 문의하기를 눌렀을때 레코드 추가
	public int insert(RequestChat requestChat) {
		String query = "insert into request_chat values(0, ?, ?)";
		return this.jdbcTemplate.update(query, requestChat.getMenti_id(), requestChat.getMentor_id());
	}
	
	// ?
	public int delete(RequestChat requestChat) {
		String query = "delete from request_chat where chat_id = ?";
		return this.jdbcTemplate.update(query, requestChat.getChat_id());
	}
}
