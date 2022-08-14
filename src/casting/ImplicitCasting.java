package casting;

public class ImplicitCasting {

	public static void main(String[] args) {
		// Implicit Casting-- memory size increasing, no data loss
		int a=10;
		System.out.println(a);
		
		double b=a;
		System.out.println(b);

		
		// explicit casting -size decreasing, data loss
		double c=123.1234;
	    System.out.println(c);
	    
	    int d=(int) c;
	    
	    System.out.println(d);
	    
	}

}
