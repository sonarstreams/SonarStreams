package com.fino.dms.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Immutable;
import com.fasterxml.jackson.annotation.JsonIgnore;

//@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Immutable
@Table(name="Employee")
public class Employee {

	@Id
	@Column(name="empno", columnDefinition = "int")
	private Integer empno;	
	
	@Column(name="ename", columnDefinition = "varchar")
	private String ename;
	
	@Column(name="job", columnDefinition = "varchar")
	private String job;
	
	
	@JsonIgnore
	@Column(name="mgr", columnDefinition = "int")
	private Integer mgr;
	
	@Column(name="hiredate", columnDefinition = "date")
	private Date hiredate;
	
	//@Column(name="sal", columnDefinition = "decimal")
	@Column(name="sal", columnDefinition="Decimal(10,2) default '100.00'")
	private Double sal;
	
	//@Column(name="comm", columnDefinition = "decimal")
	@JsonIgnore
	@Column(name="comm", columnDefinition="Decimal(10,2) default '100.00'")
	private Double comm;
	
	@Column(name="deptno", columnDefinition = "int")
	private Integer deptno;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate="
				+ hiredate + ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
	}

	

}
