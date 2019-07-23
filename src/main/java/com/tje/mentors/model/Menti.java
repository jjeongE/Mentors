package com.tje.mentors.model;

import java.util.Date;

public class Menti {
	private int menti_id;
	private String menti_email;
	private String menti_name;
	private String menti_password;
	private String menti_profile;
	private String simple_login_CK;
	private Date regist_date;
	
	public Menti() {
		// TODO Auto-generated constructor stub
	}

	public Menti(int menti_id, String menti_email, String menti_name, String menti_password, String menti_profile,
			String simple_login_CK, Date regist_date) {
		super();
		this.menti_id = menti_id;
		this.menti_email = menti_email;
		this.menti_name = menti_name;
		this.menti_password = menti_password;
		this.menti_profile = menti_profile;
		this.simple_login_CK = simple_login_CK;
		this.regist_date = regist_date;
	}

	public int getMenti_id() {
		return menti_id;
	}

	public void setMenti_id(int menti_id) {
		this.menti_id = menti_id;
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

	public String getMenti_password() {
		return menti_password;
	}

	public void setMenti_password(String menti_password) {
		this.menti_password = menti_password;
	}

	public String getMenti_profile() {
		return menti_profile;
	}

	public void setMenti_profile(String menti_profile) {
		this.menti_profile = menti_profile;
	}

	public String getSimple_login_CK() {
		return simple_login_CK;
	}

	public void setSimple_login_CK(String simple_login_CK) {
		this.simple_login_CK = simple_login_CK;
	}

	public Date getRegist_date() {
		return regist_date;
	}

	public void setRegist_date(Date regist_date) {
		this.regist_date = regist_date;
	}

	
}
