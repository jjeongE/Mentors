package com.tje.mentors.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tje.mentors.model.RequestContents;

// 채팅 내용
@Repository
public class RequestContentsDAO {
	private JdbcTemplate jdbcTemplate;
	@Autowired
	public RequestContentsDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	class RequestContentsRowMapper implements RowMapper<RequestContents> {

		@Override
		public RequestContents mapRow(ResultSet rs, int rowNum) throws SQLException {
			RequestContents requestContents = new RequestContents(rs.getInt("chat_id"), rs.getInt("sender"),
					rs.getInt("receiver"), rs.getString("content"), rs.getDate("write_date"));
			return requestContents;
		}
	}
	
	// ??
	public Object selectAllById(RequestContents requestContents) {
		String query = "select * from request_chat where chat_id = ?";		
		try {
			return this.jdbcTemplate.query(query, new RequestContentsRowMapper(), requestContents.getChat_id());
		} catch (DataAccessException e) {
			e.printStackTrace();
			return null;
		}
	}	
	
	// 채팅창에서 전송버튼을 눌렀을때의 레코드 추가
	public int insert(RequestContents requestContents) {
		String query = "insert into request_chat values(?, ?, ?, ?, now())";
		return this.jdbcTemplate.update(query, requestContents.getChat_id(), requestContents.getSender(), requestContents.getReceiver(), requestContents.getContent());
	}
	
	// ??
	public int delete(RequestContents requestContents) {
		String query = "delete from request_chat where chat_id = ?";
		return this.jdbcTemplate.update(query, requestContents.getChat_id());
	}
}
