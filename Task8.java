package Task10;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int x = sc.nextInt();  
        System.out.printf("The absolute value of %d is: %d",x, convert (x));
		System.out.printf("\n");
    }
    public static int convert (int n)
	{
		int absvalue = (n >= 0) ? n : -n;
		return absvalue;

	}

}
