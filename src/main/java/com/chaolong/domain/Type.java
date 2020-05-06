package com.chaolong.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Type implements Serializable{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	
	private BigInteger id;
	private BigDecimal price;
	private String type;
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Type(BigInteger id, BigDecimal price, String type) {
		super();
		this.id = id;
		this.price = price;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Type [id=" + id + ", price=" + price + ", type=" + type + "]";
	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Type other = (Type) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
