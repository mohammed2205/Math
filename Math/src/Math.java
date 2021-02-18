import java.util.Scanner;

public class Math {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		 System.out.println("use int then double for +");
		 System.out.println("use int then int for -");
		 System.out.println("use double then double for *");
		 System.out.println("use double  then int for /");
		 
		double x =input.nextDouble();
		double z =input.nextDouble();
		 Math( x ,z );
		 Math(x ,z );
		 Math(x ,z );
		 Math(x ,z );
		 Math (x ,z);
		
	}
public static double  Math (int  a, double b) {
	
	 System.out.println(a+b);
	return a+b;
	}
		
	public static double  Math (int a, int  b) {
		 System.out.println(a-b);
		return a+b;
	}
    public static void  Math (double a, double b) {
    	 System.out.println(a*b);
	}
    public static void  Math (double a, int b) {
    	 System.out.println(a/b);
    }
	
}
