package casting;

public class Upcasting {

	public static void main(String[] args) 
	{   
		Father f= new Father();
        Son s= new Son();
        
        f.car();
        f.bike();
        System.out.println("=========");
        s.car();
        s.bike();
        s.degree();
        System.out.println("=========");
        
        Father f1= new Son(); //object- 
        f1.bike(); //common method
        f1.car(); // common method
     // f1.degree(); //not supported-- not a common property 
        
	}

}
