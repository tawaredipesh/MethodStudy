package inheritance;

public class Hierarchical {

	public static void main(String[] args) {
	
		A a= new A(); // created object of class
		a.test(); // calling non static method from A Class 
		
	    B b= new B();
	    b.demo();// using object b calling method of B class
	    b.test(); // using object b calling method of A Class
	    
	    C c= new C();
	    c.sample(); //using object c calling method of C class
	    c.test(); // using object c calling method of A Class

	}

}
