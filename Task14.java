package Task10;

import java.util.Scanner;

public class Task14 {
	public static float square_Root(float num) 
    { 
        float a = num; 
        float b = 1; 
        double e = 0.000001; 
        while (a - b > e) { 
            a = (a + b) / 2; 
            b = num / a; 
        } 
        return a; 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        sc.close(); 
		System.out.println("Square root of a number using Babylonian method: "+square_Root(num));
	}

}
