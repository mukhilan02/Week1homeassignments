package week1.day2;

import java.util.Iterator;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int no=7;
     int count = 0;
     for(int i=2;i<no;i++)
     {
    	 if (no%i==0) {
    		 count++;
			
		}
     }
     if (count>0) {
    	 System.out.println("Given number is not prime");
		
	}
     else {
		System.out.println("Given number is prime");
	}
	}
      
}
