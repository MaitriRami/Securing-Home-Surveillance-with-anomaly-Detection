package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Complain_master")
public class ComplainVO {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="complainSubject")
	private String complainSubject;
	
	@Column(name="complainDescription")
	private String complainDescription;
	
	@Column(name="complainTime")
	private String complainTime;
	
	@Column(name="reply")
	private String reply;
	
	@Column(name="replyTime")
	private String replyTime;
	
	@Column(name="complainStatus")
	private String complainStatus;
	
	@Column(name="status")
	private boolean status;
	
	@ManyToOne 
	private LoginVO loginVO;

	public boolean isStatus() {
		return status;
	}

	public LoginVO getLoginVO() {
		return loginVO;
	}

	public void setLoginVO(LoginVO loginVO) {
		this.loginVO = loginVO;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String getComplainStatus() {
		return complainStatus;
	}

	public void setComplainStatus(String complainStatus) {
		this.complainStatus = complainStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComplainSubject() {
		return complainSubject;
	}

	public void setComplainSubject(String complainSubject) {
		this.complainSubject = complainSubject;
	}

	public String getComplainDescription() {
		return complainDescription;
	}

	public void setComplainDescription(String complainDescription) {
		this.complainDescription = complainDescription;
	}

	public String getComplainTime() {
		return complainTime;
	}

	public void setComplainTime(String complainTime) {
		this.complainTime = complainTime;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public String getReplyTime() {
		return replyTime;
	}

	public void setReplyTime(String replyTime) {
		this.replyTime = replyTime;
	}

	
}
