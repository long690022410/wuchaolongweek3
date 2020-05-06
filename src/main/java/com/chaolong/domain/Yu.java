package com.chaolong.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Yu implements Serializable{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	private Integer yid;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date ding;
	private String name;
	private String phone;
	private String type;
	private BigDecimal price;
	private String com;
	private Integer id;
	public Yu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Yu(Integer yid, Date ding, String name, String phone, String type, BigDecimal price, String com,
			Integer id) {
		super();
		this.yid = yid;
		this.ding = ding;
		this.name = name;
		this.phone = phone;
		this.type = type;
		this.price = price;
		this.com = com;
		this.id = id;
	}
	public Integer getYid() {
		return yid;
	}
	public void setYid(Integer yid) {
		this.yid = yid;
	}
	public Date getDing() {
		return ding;
	}
	public void setDing(Date ding) {
		this.ding = ding;
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
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Yu [yid=" + yid + ", ding=" + ding + ", name=" + name + ", phone=" + phone + ", type=" + type
				+ ", price=" + price + ", com=" + com + ", id=" + id + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Yu other = (Yu) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
