package com.fsociety.service.beans;

import com.fsociety.api.common.base.BasicBean;

public class Demo extends BasicBean {
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String username;

	private Integer num;

	private String uptateTime;

	public Demo(Integer id, String username, Integer num, String uptateTime) {
		this.id = id;
		this.username = username;
		this.num = num;
		this.uptateTime = uptateTime;
	}

	public Demo() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getUptateTime() {
		return uptateTime;
	}

	public void setUptateTime(String uptateTime) {
		this.uptateTime = uptateTime == null ? null : uptateTime.trim();
	}
}