package com.chaolong.vo;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class QueryVO {
	
	private String name;
	private String phone;
	private String type;
	private BigDecimal p1;
	private BigDecimal p2;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date t1;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date t2;
	public QueryVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QueryVO(String name, String phone, String type, BigDecimal p1, BigDecimal p2, Date t1, Date t2) {
		super();
		this.name = name;
		this.phone = phone;
		this.type = type;
		this.p1 = p1;
		this.p2 = p2;
		this.t1 = t1;
		this.t2 = t2;
	}
	@Override
	public String toString() {
		return "QueryVO [name=" + name + ", phone=" + phone + ", type=" + type + ", p1=" + p1 + ", p2=" + p2 + ", t1="
				+ t1 + ", t2=" + t2 + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public BigDecimal getP1() {
		return p1;
	}
	public void setP1(BigDecimal p1) {
		this.p1 = p1;
	}
	public BigDecimal getP2() {
		return p2;
	}
	public void setP2(BigDecimal p2) {
		this.p2 = p2;
	}
	public Date getT1() {
		return t1;
	}
	public void setT1(Date t1) {
		this.t1 = t1;
	}
	public Date getT2() {
		return t2;
	}
	public void setT2(Date t2) {
		this.t2 = t2;
	}
	
	
	
	
}
