package com.tka.oct_18_Copy_2;

public class Passenger {
	private int pId;
	private String pName;
	private int mob;
	private int age;

	public Passenger() {

	}

	public Passenger(int pId, String pName, int mob, int age) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.mob = mob;
		this.age = age;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getMob() {
		return mob;
	}

	public void setMob(int mob) {
		this.mob = mob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
