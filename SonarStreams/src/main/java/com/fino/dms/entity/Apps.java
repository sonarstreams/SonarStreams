package com.fino.dms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "app")
public class Apps {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "app_name", length = 255)
	private String appName;
	@Column(name = "app_size", length = 255)
	private long appSize;
	@ManyToOne
	@JoinColumn(name = "mobile_id", nullable = false)
	private Mobile mobile;

	public Apps() {

	}

	public Apps( String appName, long appSize, Mobile mobile) {
        
		this.appName = appName;
		this.appSize = appSize;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Apps [id=" + id + ", appName=" + appName + ", appSize=" + appSize + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public long getAppSize() {
		return appSize;
	}

	public void setAppSize(long appSize) {
		this.appSize = appSize;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

}
