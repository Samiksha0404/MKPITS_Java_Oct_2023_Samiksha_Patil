package com.mkpits.arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String []copyFrom = {
		   "affogato","americano"," cappuccino","corretto","cortado","doppio","espresso",
		   "frappucino","freddo","lungo","macchiato",
		   "marocchino","ristretto"};
   
   String[] copyTo = new String[7];
   //for each loop sirf print karne k liye use hota hai isse user input ni le sakta hai
   System.arraycopy(copyFrom, 2, copyTo,0,7);
   for(String coffee : copyTo)//foreach loop
	   // 2 in
   {
	   System.out.print(coffee+ " ");
   }
}

}
