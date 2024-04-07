package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodsOfBank 
{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	String name;
	long mobNo;
	long aadharNo;
	String address;
	double deposit;
	double balence;
	
	public void setBr(BufferedReader br) {
		this.br = br;
	}
	public void setBalence(double balence) {
		this.balence = balence;
	}
	public BufferedReader getBr() {
		return br;
	}
	public double getBalence() {
		return balence;
	}
	public String getName() {
		return name;
	}
	public long getMobNo() {
		return mobNo;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public String getAddress() {
		return address;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	
	public void showDetails()
	{
		System.out.println("Name :-"+getName());
		System.out.println("Mobile No. :-"+getMobNo());
		System.out.println("Aadhar No. :-"+getAadharNo());
		System.out.println("Address :-"+getAddress());
	}
	
	public void deposit(double depositMoney)
	{
		this.balence=this.deposit+depositMoney;
		//setDeposit(this.balence);
		setBalence(this.balence);
		
	}
	
	public void withdrowMoney(double withdrowMoney)
	{
		if(this.deposit>0 && this.deposit>=withdrowMoney) 
		{
		 this.balence= this.deposit-withdrowMoney;
		  System.out.println("Money Wthdrow :"+withdrowMoney);
		}else
			System.out.println("Your Balence is not Sufficient");
		setDeposit(this.balence);
	}
	
	public double balence()
	{
		return balence;
	}
	
}
