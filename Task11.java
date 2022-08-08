package Task10;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the first integer number: ");
	        int x = sc.nextInt();  
			System.out.print("Enter the second integer number: ");
	        int y = sc.nextInt(); 
	        System.out.print("The result is: "+calculate(x, y));
			System.out.printf("\n");
	    }

	  public static boolean calculate(int p, int q)
	   {
		if(p == 15 || q == 15)
			return true;
		return ((p + q) == 15 || Math.abs(p - q) == 15);
	   }
	}


