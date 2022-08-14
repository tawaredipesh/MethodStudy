package staicregularmethod;

public class StaticRegularClass {

	public static void main(String[] args) {
		// Static Regular Method

		test(); // Method name();---calling from same class
		
		MyClass.test2(); // classname.methodname();--- calling from different class
	}

	public static void test()
	{
		System.out.println("We are learning static regulat method for calling from same class");
	}
}
