package accessSpecifier;

public class Demo {

	public static void main(String[] args) 
	{
	        PrivateUse p = new PrivateUse(); // created object of another class
	        p.test1(); // calling public test1 method
	        //p.test2(); // private methods can be called only within class
            p.test3();// default methods can be accessed within package
	}

}
