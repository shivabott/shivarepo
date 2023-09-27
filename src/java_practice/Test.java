package java_practice;

import java.util.Iterator;
import java.util.Scanner;



public class Test
{

	public static void main(String[] args) 
	{

		

		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);  
	    System.out.println("Enter Number: ");
	    int i =myObj.nextInt();
	    
	    System.out.println(i);
		
	    for (int j = 0; j <=i; j++) 
	    {
	    	System.out.println(j);
	    
		}
	}

}
