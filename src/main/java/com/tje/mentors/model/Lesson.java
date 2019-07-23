package com.tje.mentors.model;

import java.util.Date;

public class Lesson {
	private int lesson_id;
	private int mentor_id;
	private String category_big;
	private String category_small;
	private String location;
	private String title;
	private String lesson_info;
	private String curriculum;
	private int price;
	private int total_round;
	private String lesson_thumnail;
	private double avg_score;
	private int menti_count;
	private int review_count;
	private Date write_date;
	
	public Lesson() {
		// TODO Auto-generated constructor stub
	}

	public Lesson(int lesson_id, int mentor_id, String category_big, String category_small, String location,
			String title, String lesson_info, String curriculum, int price, int total_round, String lesson_thumnail,
			double avg_score, int menti_count, int review_count, Date write_date) {
		super();
		this.lesson_id = lesson_id;
		this.mentor_id = mentor_id;
		this.category_big = category_big;
		this.category_small = category_small;
		this.location = location;
		this.title = title;
		this.lesson_info = lesson_info;
		this.curriculum = curriculum;
		this.price = price;
		this.total_round = total_round;
		this.lesson_thumnail = lesson_thumnail;
		this.avg_score = avg_score;
		this.menti_count = menti_count;
		this.review_count = review_count;
		this.write_date = write_date;
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

	public String getCategory_big() {
		return category_big;
	}

	public void setCategory_big(String category_big) {
		this.category_big = category_big;
	}

	public String getCategory_small() {
		return category_small;
	}

	public void setCategory_small(String category_small) {
		this.category_small = category_small;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLesson_info() {
		return lesson_info;
	}

	public void setLesson_info(String lesson_info) {
		this.lesson_info = lesson_info;
	}

	public String getCurriculum() {
		return curriculum;
	}

	public void setCurriculum(String curriculum) {
		this.curriculum = curriculum;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTotal_round() {
		return total_round;
	}

	public void setTotal_round(int total_round) {
		this.total_round = total_round;
	}

	public String getLesson_thumnail() {
		return lesson_thumnail;
	}

	public void setLesson_thumnail(String lesson_thumnail) {
		this.lesson_thumnail = lesson_thumnail;
	}

	public double getAvg_score() {
		return avg_score;
	}

	public void setAvg_score(double avg_score) {
		this.avg_score = avg_score;
	}

	public int getMenti_count() {
		return menti_count;
	}

	public void setMenti_count(int menti_count) {
		this.menti_count = menti_count;
	}

	public int getReview_count() {
		return review_count;
	}

	public void setReview_count(int review_count) {
		this.review_count = review_count;
	}

	public Date getWrite_date() {
		return write_date;
	}

	public void setWrite_date(Date write_date) {
		this.write_date = write_date;
	}
	
}
