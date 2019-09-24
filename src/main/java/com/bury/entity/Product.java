package com.bury.entity;

import java.sql.Date;

import com.alibaba.fastjson.annotation.JSONField;


public class Product {

	private int id;
	private String name;
	private String subTitle;
	private Float orignalPrice;
	private Float promotePrice;
	private int stock;
	private int cid;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public Float getOrignalPrice() {
		return orignalPrice;
	}
	public void setOrignalPrice(Float orignalPrice) {
		this.orignalPrice = orignalPrice;
	}
	public Float getPromotePrice() {
		return promotePrice;
	}
	public void setPromotePrice(Float promotePrice) {
		this.promotePrice = promotePrice;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Product(int id, String name, String subTitle, Float orignalPrice, Float promotePrice, int stock, int cid,
			Date createDate) {
		super();
		this.id = id;
		this.name = name;
		this.subTitle = subTitle;
		this.orignalPrice = orignalPrice;
		this.promotePrice = promotePrice;
		this.stock = stock;
		this.cid = cid;
		this.createDate = createDate;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", subTitle=" + subTitle + ", orignalPrice=" + orignalPrice
				+ ", promotePrice=" + promotePrice + ", stock=" + stock + ", cid=" + cid + ", createDate=" + createDate
				+ "]";
	}
	
}
