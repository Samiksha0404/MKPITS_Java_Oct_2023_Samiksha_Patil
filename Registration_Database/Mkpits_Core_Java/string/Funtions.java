package com.mkpits.string;



public class Funtions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Funtions o =new Funtions();
    o.getOverView();
	}

	private void getOverView() {
		// TODO Auto-generated method stub
		String fname="SAMIKSHAP ";
		
		String lname="samiksha";
		
		String name ="sami";
		
		System.out.println(String.join("@",fname,lname));//join is used add a unique charachter 
		//between two strings
		
		
		System.out.println(fname.charAt(5));//charAt gives the character at the pass index value
		
		
		System.out.println(lname.chars());
		
		
		System.out.println(name.compareTo(lname));//compares two strings
		
		
		System.out.println(fname.compareToIgnoreCase(lname));//compares fname and lname and 
		
		
		//ignores the case and gives o/p value 1; fname has 9 characters and lname has 8;9-8=1
		
		
		System.out.println(lname.indexOf("h"));//gives index of the element
		
		byte[] num= {65,66,67,68,69,35,50};
		char ch[]= {'x','y','z','2','1'};
		
		String obj = new String(num);//automatically giving ascii values of byte array
		 System.out.println(obj);
		 
		String obj1 = new String(name);
		System.out.println(obj1.concat(lname));
		 //joins two strings
		
		String obj2 = new String(name);
		System.out.println(fname.concat(obj2));
		
		System.out.println(lname.contains(name));
		//checks that lname contains string name
		
		System.out.println(lname.contentEquals(name));
//		for(int i =0;i<b.length;i++) {
//		System.out.println(b[i].getBytes(i));
//		
//		}
//		
		System.out.println(fname.toLowerCase());
		//converts string to lowercase
		
		System.out.println(lname.toUpperCase());
		//converts string to uppercase
		
		
		System.out.println(name.replace("i", "y"));//replace a particular element with other element
		System.out.println(fname.replace("P", " "));
		
		
	}

}
