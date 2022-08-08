package Task10;

import java.util.HashSet;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers = new int[] {
				    -1, -1, 0, 2, 2, 3, 0, 1, 5, 9
				   };
				   int count = 0;
				   HashSet < Integer > set = new HashSet < Integer > ();

				   for (int i = 0; i < numbers.length; i++) {
				    int n = Math.abs(numbers[i]);
				    if (!set.contains(n)) {
				     set.add(n);
				     count++;
				    }
				   }
				   System.out.println(count);
				  }
	}


