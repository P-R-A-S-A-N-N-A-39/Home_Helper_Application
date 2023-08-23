package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User_Table")
public class UserModel {
    @Id
	private int uid;
	private String uname;
	private String uaddress;
	private long unumber;
	private String umail;
	private String ser_need;
	public UserModel(int uid, String uname, String uaddress, long unumber, String umail, String ser_need) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uaddress = uaddress;
		this.unumber = unumber;
		this.umail = umail;
		this.ser_need = ser_need;
	}
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUaddress() {
		return uaddress;
	}
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}
	public long getUnumber() {
		return unumber;
	}
	public void setUnumber(long unumber) {
		this.unumber = unumber;
	}
	public String getUmail() {
		return umail;
	}
	public void setUmail(String umail) {
		this.umail = umail;
	}
	public String getSer_need() {
		return ser_need;
	}
	public void setSer_need(String ser_need) {
		this.ser_need = ser_need;
	}
	
}
