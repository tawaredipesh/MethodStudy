package variableTypes;

public class GlobalAndLocalVariable1 {
       // Non-static global variable
	int a=50;//1+2 Declaration + Assign value
	
	   // static global variable 
	  static int b=20;//1+2 Declaration +Assign value
	  
	  public static void main(String[] args) 
	  {
		  GlobalAndLocalVariable1 g= new GlobalAndLocalVariable1();// created object of class
		  g.addition();// calling non static method from same class
		  substraction();// calling static method from same class
		  System.out.println("global variable of a is "+g.a); // calling non static global variable from same class
		  System.out.println("global value of b is "+b);// calling static global variable from same class
		  
		  int sum=10+g.a; // usage of non static global variable from same class
		  System.out.println("sum is "+sum);
		  int sub=100-b;// usage of static global variable from same class
		  System.out.println("sub is "+sub);  
          		  
		  // calling non static global variable from another class 
		  // need to create object of another class(sample class2)
		  
		  Sample2 s= new Sample2();// created object of class
		  System.out.println("Value of non static global vairable from another class is "+s.d);
		  
		  // calling static global variable from another class
		  System.out.println("Value of static global variable from another class is "+Sample2.t);
		  

	  }

	  public void addition()
	  {
		  int a=40;// local variable 
		  int add=a+10;
		  System.out.println("Sum is "+ add);
	  }
	  
	  public static void substraction()
	  {
		  int b=100;
		  int sub=b-10;
		  System.out.println("Substraction is "+ sub);
	  }
	  
}
