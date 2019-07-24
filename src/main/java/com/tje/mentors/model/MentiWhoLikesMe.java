package com.tje.mentors.model;

public class MentiWhoLikesMe {
	private int like_id;
	private int lesson_id;
	private int menti_id;
	private String menti_name;
	private String menti_email;
	private String title;
	private int mentor_id;
	
	public MentiWhoLikesMe() {
		// TODO Auto-generated constructor stub
	}

	public MentiWhoLikesMe(int like_id, int lesson_id, int menti_id, String menti_name, String menti_email,
			String title, int mentor_id) {
		super();
		this.like_id = like_id;
		this.lesson_id = lesson_id;
		this.menti_id = menti_id;
		this.menti_name = menti_name;
		this.menti_email = menti_email;
		this.title = title;
		this.mentor_id = mentor_id;
	}

	public int getLike_id() {
		return like_id;
	}

	public void setLike_id(int like_id) {
		this.like_id = like_id;
	}

	public int getLesson_id() {
		return lesson_id;
	}

	public void setLesson_id(int lesson_id) {
		this.lesson_id = lesson_id;
	}

	public int getMenti_id() {
		return menti_id;
	}

	public void setMenti_id(int menti_id) {
		this.menti_id = menti_id;
	}

	public String getMenti_name() {
		return menti_name;
	}

	public void setMenti_name(String menti_name) {
		this.menti_name = menti_name;
	}

	public String getMenti_email() {
		return menti_email;
	}

	public void setMenti_email(String menti_email) {
		this.menti_email = menti_email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getMentor_id() {
		return mentor_id;
	}

	public void setMentor_id(int mentor_id) {
		this.mentor_id = mentor_id;
	}
	
}
