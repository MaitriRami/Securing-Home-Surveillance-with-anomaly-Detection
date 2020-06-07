package com.project.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Package_master")
public class PackageVO {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="packageName")
	private String packageName;
	
	@Column(name="packagePrice")
	private String packagePrice;
	
	@Column(name="packageDuration")
	private String packageDuration;
	
	
	@Column(name="packageDescription")
	private String packageDescription;
	
	@Column(name="status")
	private boolean status;
	
	
	public String getPackageDuration() {
		return packageDuration;
	}

	public void setPackageDuration(String packageDuration) {
		this.packageDuration = packageDuration;
	}

	public String getPackageDescription() {
		return packageDescription;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPackagePrice() {
		return packagePrice;
	}

	public void setPackagePrice(String packagePrice) {
		this.packagePrice = packagePrice;
	}

	
	public void setPackageDescription(String packageDescription) {
		this.packageDescription = packageDescription;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
}
