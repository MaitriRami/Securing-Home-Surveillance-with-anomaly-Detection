package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "unkownPerson_master")
public class UnkownPersonVO {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private LoginVO loginVO;

	@Column(name = "unkownPerson")
	private String unkownPerson;
	
	@Column(name = "personDetectionDate")
	private String personDetectionDate;

	public String getPersonDetectionDate() {
		return personDetectionDate;
	}

	public void setPersonDetectionDate(String personDetectionDate) {
		this.personDetectionDate = personDetectionDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LoginVO getLoginVO() {
		return loginVO;
	}

	public void setLoginVO(LoginVO loginVO) {
		this.loginVO = loginVO;
	}

	public String getUnkownPerson() {
		return unkownPerson;
	}

	public void setUnkownPerson(String unkownPerson) {
		this.unkownPerson = unkownPerson;
	}
	
	

}
