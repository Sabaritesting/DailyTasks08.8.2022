package Task10;

import java.math.BigDecimal;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 float x = 451.3256412f;
	        BigDecimal result;
			int decimal_place = 4;
			BigDecimal bd_num = new BigDecimal(Float.toString(x));
	        bd_num = bd_num.setScale(decimal_place, BigDecimal.ROUND_HALF_UP); 
			System.out.printf("Original number: %.7f\n",x);
	        System.out.println("Rounded upto 4 decimal: "+bd_num);
	}

}
