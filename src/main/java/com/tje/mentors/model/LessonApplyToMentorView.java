package com.tje.mentors.model;

import java.util.Date;

public class LessonApplyToMentorView {
	private int apply_id;
	private int lesson_id;
	private int mentor_id;
	private int menti_id;
	private Date regist_date;
	private String title;
	private String menti_email;
	private String menti_name;
	
	public LessonApplyToMentorView() {
		// TODO Auto-generated constructor stub
	}

	public LessonApplyToMentorView(int apply_id, int lesson_id, int mentor_id, int menti_id, Date regist_date,
			String title, String menti_email, String menti_name) {
		super();
		this.apply_id = apply_id;
		this.lesson_id = lesson_id;
		this.mentor_id = mentor_id;
		this.menti_id = menti_id;
		this.regist_date = regist_date;
		this.title = title;
		this.menti_email = menti_email;
		this.menti_name = menti_name;
	}

	public int getApply_id() {
		return apply_id;
	}

	public void setApply_id(int apply_id) {
		this.apply_id = apply_id;
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

	public int getMenti_id() {
		return menti_id;
	}

	public void setMenti_id(int menti_id) {
		this.menti_id = menti_id;
	}

	public Date getRegist_date() {
		return regist_date;
	}

	public void setRegist_date(Date regist_date) {
		this.regist_date = regist_date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMenti_email() {
		return menti_email;
	}

	public void setMenti_email(String menti_email) {
		this.menti_email = menti_email;
	}

	public String getMenti_name() {
		return menti_name;
	}

	public void setMenti_name(String menti_name) {
		this.menti_name = menti_name;
	}
	
	
}
