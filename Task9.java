package Task10;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a float number: ");
        float  x = sc.nextFloat();  
        System.out.printf("The absolute value of %.2f is: %.2f",x, convert(x));
		System.out.printf("\n");
    }

    public static float convert(float n)
	{
		float absvalue = (n >= 0) ? n : -n;
		return absvalue;
	}

}
