package com.test02;

public class Address {

	private String addr;

	private String tel;
	private String name;

	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	public String getTel() {
		return tel;
	}

	public Address(String name, String addr, String tel) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}

}
