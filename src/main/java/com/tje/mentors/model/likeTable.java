package com.tje.mentors.model;

public class LikeTable {
	private int like_id;
	private int lesson_id;
	private int menti_id;
	
	public LikeTable() {
		// TODO Auto-generated constructor stub
	}

	public LikeTable(int like_id, int lesson_id, int menti_id) {
		super();
		this.like_id = like_id;
		this.lesson_id = lesson_id;
		this.menti_id = menti_id;
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
	
}
