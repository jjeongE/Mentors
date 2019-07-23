package com.tje.mentors.model;

import java.util.Date;

public class ChatView {
	private int chat_id;
	private int mentor_id;
	private int menti_id;
	private int sender;
	private int receiver;
	private String content;
	private Date write_date;
	
	public ChatView() {
		// TODO Auto-generated constructor stub
	}

	public ChatView(int chat_id, int mentor_id, int menti_id, int sender, int receiver, String content,
			Date write_date) {
		super();
		this.chat_id = chat_id;
		this.mentor_id = mentor_id;
		this.menti_id = menti_id;
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
		this.write_date = write_date;
	}

	public int getChat_id() {
		return chat_id;
	}

	public void setChat_id(int chat_id) {
		this.chat_id = chat_id;
	}

	public int getMentor_id() {
		return mentor_id;
	}

	public void setMentor_id(int mentor_id) {
		this.mentor_id = mentor_id;
	}

	public int getMenti_id() {
		return menti_id;
	}

	public void setMenti_id(int menti_id) {
		this.menti_id = menti_id;
	}

	public int getSender() {
		return sender;
	}

	public void setSender(int sender) {
		this.sender = sender;
	}

	public int getReceiver() {
		return receiver;
	}

	public void setReceiver(int receiver) {
		this.receiver = receiver;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getWrite_date() {
		return write_date;
	}

	public void setWrite_date(Date write_date) {
		this.write_date = write_date;
	}
	
	
}
