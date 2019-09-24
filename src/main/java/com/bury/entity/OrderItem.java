package com.bury.entity;

public class OrderItem {

	private int id;
	private int pid;
	private int oid;
	private int uid;
	private int number;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public OrderItem(int id, int pid, int oid, int uid, int number) {
		super();
		this.id = id;
		this.pid = pid;
		this.oid = oid;
		this.uid = uid;
		this.number = number;
	}
	public OrderItem() {
		super();
	}
	@Override
	public String toString() {
		return "orderitem [id=" + id + ", pid=" + pid + ", oid=" + oid + ", uid=" + uid + ", number=" + number + "]";
	}
	
}
