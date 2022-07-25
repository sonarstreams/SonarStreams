package com.fino.dms.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "mobile")

public class Mobile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "mobile_name", length = 255)
	private String mobileName;
	@Column(name = "mobile_company", length = 255)
	private String mobileCompany;
	@OneToMany(mappedBy = "mobile", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Apps> apps;

	public Mobile() {

	}

	public Mobile( String mobileName, String mobileCompany) {

	
		this.mobileName = mobileName;
		this.mobileCompany = mobileCompany;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public String getMobileCompany() {
		return mobileCompany;
	}

	public void setMobileCompany(String mobileCompany) {
		this.mobileCompany = mobileCompany;
	}

	public Set<Apps> getApps() {
		return apps;
	}

	public void setApps(Set<Apps> apps) {
		this.apps = apps;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", mobileName=" + mobileName + ", mobileCompany=" + mobileCompany + ", apps=" + apps
				+ "]";
	}

}
