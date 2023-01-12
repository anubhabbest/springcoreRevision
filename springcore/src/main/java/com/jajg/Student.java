package com.jajg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("1")
	private int sId;
	@Autowired
	private Address address;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student() {
		
	}
	public Student(int sId, Address address) {
		this.sId = sId;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", address=" + address + "]";
	}
	
	
	
//	private String sAdderess;
//	public int getsId() {
//		return sId;
//	}
//	public void setsId(int sId) {
//		this.sId = sId;
//	}
//	public String getsAdderess() {
//		return sAdderess;
//	}
//	public void setsAdderess(String sAdderess) {
//		this.sAdderess = sAdderess;
//	}
//	public Student() {
//		
//	}
//	public Student(int sId, String sAdderess) {
//		super();
//		this.sId = sId;
//		this.sAdderess = sAdderess;
//	}
//	@Override
//	public String toString() {
//		return "Student [sId=" + sId + ", sAdderess=" + sAdderess + "]";
//	}
//	
	
	
}
