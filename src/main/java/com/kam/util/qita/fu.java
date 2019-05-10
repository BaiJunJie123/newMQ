package com.kam.util.qita;

public class fu {

	private String name;
	private String pass;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public fu(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	public fu() {
		super();
	}
	public void fushow() {
		System.out.println("我是父类");
	}
	
}
