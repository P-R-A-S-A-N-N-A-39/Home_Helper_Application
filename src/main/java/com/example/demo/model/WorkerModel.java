package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Worker_Table")
public class WorkerModel {
	@Id
	
	private int wid;
	private String wName;
	private String waddress;
	private long wnumber;
	private String wexp;
	private String wgender;
	private String wskills;
	private String wclients;
	private String status;
	private int rating;
	public WorkerModel(int wid, String wName, String waddress, long wnumber, String wexp, String wgender,
			String wskills, String wclients, String status, int rating) {
		super();
		this.wid = wid;
		this.wName = wName;
		this.waddress = waddress;
		this.wnumber = wnumber;
		this.wexp = wexp;
		this.wgender = wgender;
		this.wskills = wskills;
		this.wclients = wclients;
		this.status = status;
		this.rating = rating;
	}
	public WorkerModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public String getwName() {
		return wName;
	}
	public void setwName(String wName) {
		this.wName = wName;
	}
	public String getWaddress() {
		return waddress;
	}
	public void setWaddress(String waddress) {
		this.waddress = waddress;
	}
	public long getWnumber() {
		return wnumber;
	}
	public void setWnumber(long wnumber) {
		this.wnumber = wnumber;
	}
	public String getWexp() {
		return wexp;
	}
	public void setWexp(String wexp) {
		this.wexp = wexp;
	}
	public String getWgender() {
		return wgender;
	}
	public void setWgender(String wgender) {
		this.wgender = wgender;
	}
	public String getWskills() {
		return wskills;
	}
	public void setWskills(String wskills) {
		this.wskills = wskills;
	}
	public String getWclients() {
		return wclients;
	}
	public void setWclients(String wclients) {
		this.wclients = wclients;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
   
}
