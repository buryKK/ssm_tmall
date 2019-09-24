package com.bury.entity;

public class PropertyValue {

	private int id;
	private int pid;
	private int ptid;
	private String value;
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
	public int getPtid() {
		return ptid;
	}
	public void setPtid(int ptid) {
		this.ptid = ptid;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public PropertyValue(int id, int pid, int ptid, String value) {
		super();
		this.id = id;
		this.pid = pid;
		this.ptid = ptid;
		this.value = value;
	}
	public PropertyValue() {
		super();
	}
	@Override
	public String toString() {
		return "propertyvalue [id=" + id + ", pid=" + pid + ", ptid=" + ptid + ", value=" + value + "]";
	}
	
}
