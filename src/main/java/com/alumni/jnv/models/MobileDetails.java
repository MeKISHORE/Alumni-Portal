package com.alumni.jnv.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 * @author loveh
 *
 */
@Entity
@Table(name = "MOBILE_TBL")
public class MobileDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String mobileNumber;
	
	@Column
	private boolean personStatus;
	
	public MobileDetails() {
		super();
	}
	public MobileDetails(long id, String mobile) {
		super();
		this.id = id;
		this.mobileNumber = mobile;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMobile() {
		return mobileNumber;
	}
	public void setMobile(String mobile) {
		this.mobileNumber = mobile;
	}
	
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", mobile=" + mobileNumber + "]";
	}
	
	
	
}
