package Task10;

import java.util.Scanner;

public class Task15 {
	 public static int multiply_two_nums(int a, int b) { 
         
	        /* 0 multiplied with anything gives 0 */
	        if (b == 0) 
	            return 0; 
	      
	        if (b > 0) 
	            return (a + multiply_two_nums(a, b - 1)); 
	            
	        if (b < 0) 
	            return -multiply_two_nums(a, -b); 
	              
	        return -1; 
	    } 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();
       System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();
        sc.close(); 
       System.out.println("Multiply of two integers: "+multiply_two_nums(num1, num2));
	}

}
