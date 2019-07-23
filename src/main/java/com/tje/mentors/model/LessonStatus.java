package com.tje.mentors.model;

import java.util.Date;

public class LessonStatus {
	private int status_id;
	private int lesson_id;
	private int mentor_id;
	private int meti_id;
	private String curStatus;
	private Date start_date;
	
	public LessonStatus() {
		// TODO Auto-generated constructor stub
	}

	public LessonStatus(int status_id, int lesson_id, int mentor_id, int meti_id, String curStatus, Date start_date) {
		super();
		this.status_id = status_id;
		this.lesson_id = lesson_id;
		this.mentor_id = mentor_id;
		this.meti_id = meti_id;
		this.curStatus = curStatus;
		this.start_date = start_date;
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	public int getLesson_id() {
		return lesson_id;
	}

	public void setLesson_id(int lesson_id) {
		this.lesson_id = lesson_id;
	}

	public int getMentor_id() {
		return mentor_id;
	}

	public void setMentor_id(int mentor_id) {
		this.mentor_id = mentor_id;
	}

	public int getMeti_id() {
		return meti_id;
	}

	public void setMeti_id(int meti_id) {
		this.meti_id = meti_id;
	}

	public String getCurStatus() {
		return curStatus;
	}

	public void setCurStatus(String curStatus) {
		this.curStatus = curStatus;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	
}
