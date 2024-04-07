import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class SearchArrayElement {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of Array :");
		byte size=Byte.parseByte(br.readLine());
		int number[]=new int[size];
		
		for (int i = 0; i < number.length; i++) 
		{
			number[i]=(int) Math.ceil(Math.random()*10);
		}
		
		for (int i : number) 
		{
			System.out.println(i);
		}
		System.out.println("Enter the number which you want to find");
		byte num=Byte.parseByte(br.readLine());
		for (int i = 0; i < number.length; i++) 
		{
			if(number[i]==num)
			{
				System.out.println("Number is present at "+(i+1)+" position");
			}
			
		}
		
		
		
		
		
		
		
		

	}

}
