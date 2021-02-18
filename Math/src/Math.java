import java.util.Scanner;

public class Math {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		 System.out.println("num+num");
		 double x =input.nextDouble();
		 double z =input.nextDouble();
		 
		 System.out.println("num-num");
		 double a =input.nextDouble();
		 double s =input.nextDouble();
		 System.out.println("num*num");
		 double c =input.nextDouble();
		 double v =input.nextDouble();
		 System.out.println("num/num");
		 double n =input.nextDouble();
		 double m =input.nextDouble();
		 
		
		 Math(x, z);
		 Math(a ,s );
		 Math(c,v );
		 Math(x ,z );
		 Math (n,m);
		
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
