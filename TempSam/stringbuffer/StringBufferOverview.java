package com.mkpits.stringbuffer;


public class StringBufferOverview {

	public static void main(String[] args) {
		
		
       StringBufferOverview view = new  StringBufferOverview();
       
       view.manipulateString();
      
    		   
    		   
	}

	

	public  void manipulateString() {
	
		String str = "this is my life goal ";
		
		
		StringBuffer details = new StringBuffer(str);
		StringBuffer details1 = new StringBuffer(str);
		
		String newstr = "I love eating ice-cream";
		
	    details =details.append("\t "+newstr);
	    // \t  gives six pixels spaces
	    //\t has 4 spaces
		System.out.println(details);
		
//		 details =details.append(newstr,4,10); 
//		 //5 position print to  till 10 position 
//		 System.out.println(details );
		 
		int cap =details.capacity();
		//.capacity() gives the total number of characters store in the string including whitespaces
		System.out.println(cap);
		
		System.out.println(str.substring(5, 10));
		//from 5th position to 10th position
		
		
	//	System.out.println(details.deleteCharAt(35));//delete character at particular position
		
	//	System.out.println(details.chars()); //provides stream value
		
		
		System.out.println(details.indexOf(newstr,20 ));
 
		System.out.println(details1.reverse());
		
	}

}
