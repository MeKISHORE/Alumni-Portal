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
@Table
public class PersonDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long personId;
	@Column
	private String personName;
	@Column
	private String personBatch;
	@Column
	private String personCurrentStatus;
	@Column
	private String personAdd;
	@Column
	private String personCity;
	@Column
	private String personCurrentCity;
	@Column
	private boolean personStatus;
	
	public PersonDetails() {
	}

	
	public PersonDetails(long personId, String personName, String personBatch, String personCurrentStatus,
			String personAdd, String personCity, String personCurrentCity, boolean personStatus) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personBatch = personBatch;
		this.personCurrentStatus = personCurrentStatus;
		this.personAdd = personAdd;
		this.personCity = personCity;
		this.personCurrentCity = personCurrentCity;
		this.personStatus = personStatus;
	}


	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonBatch() {
		return personBatch;
	}

	public void setPersonBatch(String personBatch) {
		this.personBatch = personBatch;
	}

	public String getPersonCurrentStatus() {
		return personCurrentStatus;
	}

	public void setPersonCurrentStatus(String personCurrentStatus) {
		this.personCurrentStatus = personCurrentStatus;
	}

	public String getPersonAdd() {
		return personAdd;
	}

	public void setPersonAdd(String personAdd) {
		this.personAdd = personAdd;
	}

	public String getPersonCity() {
		return personCity;
	}

	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}

	public String getPersonCurrentCity() {
		return personCurrentCity;
	}

	public void setPersonCurrentCity(String personCurrentCity) {
		this.personCurrentCity = personCurrentCity;
	}

	public boolean isPersonStatus() {
		return personStatus;
	}

	public void setPersonStatus(boolean personStatus) {
		this.personStatus = personStatus;
	}

	@Override
	public String toString() {
		return "PersonDetails [personId=" + personId + ", personName=" + personName + ", personBatch=" + personBatch
				+ ", personCurrentStatus=" + personCurrentStatus + ", personAdd=" + personAdd + ", personCity="
				+ personCity + ", personCurrentCity=" + personCurrentCity + ", personStatus=" + personStatus + "]";
	}
	

	
	
}
