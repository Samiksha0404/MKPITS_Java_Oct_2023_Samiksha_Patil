package com.mkpits.collectionmodelclass;

import java.util.Objects;

public class StudentModelClass 
{
	int rollNum;
	String studName,address;
	double fees;
	
	
	
	public StudentModelClass(int rollNum, String studName, String address, double fees) {
		
		this.rollNum = rollNum;
		this.studName = studName;
		this.address = address;
		this.fees = fees;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, fees, rollNum, studName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentModelClass other = (StudentModelClass) obj;
		return Objects.equals(address, other.address)
				&& Double.doubleToLongBits(fees) == Double.doubleToLongBits(other.fees) && rollNum == other.rollNum
				&& Objects.equals(studName, other.studName);
	}
	@Override
	public String toString() {
		return "StudentModelClass [rollNum=" + rollNum + ", studName=" + studName + ", address=" + address + ", fees="
				+ fees + "]";
	}
	 
	
	
}
