package com.example.demo.model;

import java.util.List;

//import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="user_table")
public class UserModel {

	@Id
	private int uid;
	private String uname;
	private String uaddress;
	private long unumber;
	private String umail;
	private String ser_need;
	
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="skills")
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="uid")
	private List<WorkerModel> wm;

	
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserModel(int uid, String uname, String uaddress, long unumber, String umail, String ser_need,WorkerModel wm) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uaddress = uaddress;
		this.unumber = unumber;
		this.umail = umail;
		this.ser_need = ser_need;
//		this.wm = wm;
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
    public List<WorkerModel> getWm()
    {
    	return wm;
    }
    public void setWm(List<WorkerModel> wm)
    {
    	this.wm=wm;
    }
//	public WorkerModel getWm() {
//		return wm;
//	}
//
//	public void setWm(WorkerModel wm) {
//		this.wm = wm;
//	}
	

	
	
}