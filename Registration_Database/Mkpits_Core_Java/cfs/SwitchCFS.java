package com.mkpits.cfs;
 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SwitchCFS {
 static BufferedReader br;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SwitchCFS obj = new SwitchCFS();		
 br = new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter Your Choice \n1.Create Account\n2.Deposit\n3.Withdraw\n4.Check Balance");
	
 int choice = Integer.parseInt(br.readLine());
 
 switch (choice){
	  case 1:
		obj.creatAccount();
		break;
		
       case 2:
		obj.getDeposit();
		break;
		
      case 3:
	  obj.getWithdraw();
	    break;
	
      default:
	 System.out.println("Invalid Operation");
	    break;
	
	}
	
	}
	private void getWithdraw() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter amount to be withdraw");
		String withdraw= br.readLine();
	}
	private void getDeposit() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to be deposit");
		String deposit=br.readLine();
	}
	private void creatAccount()throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Enter Account holder name");
		String holder = br.readLine();
		
	}

}
