/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 What were the errors you found?
 
 Can't return with a void in the header/needs to be made a function.
 needs to return tempc
 println in wrong method 
 
 
 */

public class P4_FixTempConverter {
	public static void main(String[] args) {
		double tempf = 98.6;
		double tempc = 0.0;
		ftoc(tempf, tempc);
		
	}

	// converts Fahrenheit temperatures to Celsius
	public static double ftoc(double tempf, double tempc) {
	      tempc = (tempf - 32) * 5 / 9;
	      System.out.println("Body temp in C is: " + tempc);
	      return tempc;
    }
}
