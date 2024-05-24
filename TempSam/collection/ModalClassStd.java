package com.mkpits.collection;

import java.util.Objects;

public class ModalClassStd {

	private int rollno;
	private String name;
	
	
	public ModalClassStd(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	
	protected int getRollno() {
		return rollno;
	}
	protected void setRollno(int rollno) {
		this.rollno = rollno;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "ModalClassStd [rollno=" + rollno + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, rollno);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModalClassStd other = (ModalClassStd) obj;
		return Objects.equals(name, other.name) && rollno == other.rollno;
	}
//	
	
	
}
