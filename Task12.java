package Task10;

import java.util.BitSet;
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
		int x = sc.nextInt(); 
		System.out.print("The number of prime numbers: "+countPrimes(x));
		System.out.printf("\n");
	}

       public static int countPrimes(int n)
    {
        if(n <= 0 || n == 1 || n == 2) 
			return 0;
        else if(n == 3) 
			return 1;
        BitSet set = new BitSet();
        n = n - 1;
        int s = (int)Math.sqrt(n);
        int ctr = n;
        for(int p = 2; p <= s; p ++)
        {
            if(!set.get(p))
            {
                for(int q = 2; (p * q) <= n; q ++)
                {
                    if(!set.get(p * q))
                    {
                        ctr --;
                        set.set(p * q);
                    }
                }
            }
        }
        return ctr - 1;
	}

}
