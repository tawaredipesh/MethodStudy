package methods1;

public class NonStaticRegularMethod {

	public static void main(String[] args) {
		// Non Static Regular Method 
		NonStaticRegularMethod n= new NonStaticRegularMethod();
		// className objectName= new className(); ---created object of a class
		n.test(); // objectname.methodname();-- calling from same class

		MyClass m= new MyClass(); // className objectName= new className(); ---created object of a class
		m.MyMethod(); // objectname.methodname(); --- calling from different class
	}
public void test()
{
	System.out.println("We are learning Non Static method calling from Same Class");
}
}
