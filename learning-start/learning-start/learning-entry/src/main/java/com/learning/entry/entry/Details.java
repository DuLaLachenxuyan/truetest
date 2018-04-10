package com.learning.entry.entry;

import java.io.Serializable;

public class Details implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7419250305967348799L;
	private Integer comyid;
	private Integer userId;
	private String comname;
	private Integer classificationid;
	private String contacts;
	private String telephone;
	private String comdate;
	private Integer browses;
	private Integer money;
	private String description;
	private String picture;
	
	
	/**
	 * 
	 */
	public Details() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @param comyid
	 * @param comname
	 * @param money
	 */
	public Details(Integer comyid, String comname, Integer money) {
		super();
		this.comyid = comyid;
		this.comname = comname;
		this.money = money;
	}



	public Integer getComyid() {
		return comyid;
	}
	public void setComyid(Integer comyid) {
		this.comyid = comyid;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getComname() {
		return comname;
	}
	public void setComname(String comname) {
		this.comname = comname;
	}
	public Integer getClassificationid() {
		return classificationid;
	}
	public void setClassificationid(Integer classificationid) {
		this.classificationid = classificationid;
	}
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getComdate() {
		return comdate;
	}
	public void setComdate(String comdate) {
		this.comdate = comdate;
	}
	public Integer getBrowses() {
		return browses;
	}
	public void setBrowses(Integer browses) {
		this.browses = browses;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Details [comyid=" + comyid + ", userId=" + userId + ", comname=" + comname + ", classificationid="
				+ classificationid + ", contacts=" + contacts + ", telephone=" + telephone + ", comdate=" + comdate
				+ ", browses=" + browses + ", money=" + money + ", description=" + description + ", picture=" + picture
				+ "]";
	}
	
	
}
