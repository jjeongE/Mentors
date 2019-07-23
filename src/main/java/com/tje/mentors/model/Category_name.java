package com.tje.mentors.model;

public class Category_name {
	private int category_id;
	private String big;
	private String small;
	
	public Category_name() {
		// TODO Auto-generated constructor stub
	}

	public Category_name(int category_id, String big, String small) {
		super();
		this.category_id = category_id;
		this.big = big;
		this.small = small;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getBig() {
		return big;
	}

	public void setBig(String big) {
		this.big = big;
	}

	public String getSmall() {
		return small;
	}

	public void setSmall(String small) {
		this.small = small;
	}
	
	
}
