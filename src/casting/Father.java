package casting;

public class Father {

	public void car()
	{
		System.out.println("Mahindra Major");
	}
	
	public void bike()
	{
		System.out.println("Bajaj M80");
		
	}
	
	
	
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
        
        Father f1= new Son(); // creating object of son class and giving father class reference
        f1.bike(); //common method
        f1.car(); // common method
       // f1.degree(); //not supported-- not a common property 
	}
}
