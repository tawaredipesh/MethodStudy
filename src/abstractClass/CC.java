package abstractClass;

public class CC extends A {

	public static void main(String[] args) 
	{
        CC c= new CC(); // created object of concrete class
        c.demo1();
       c.demo2();
       
       c.demo3();
       c.demo4();
       c.demo5();
       
       c.sample();

	}
    
	 @Override
	 public void demo3()
	 {
		 System.out.println("Demo3 completed in CC");
	 }
	 
	 @Override
	 public void demo4()
	 {
		 System.out.println("Demo4 completed in CC");
	 }
	 
	 @Override
	 public void demo5()
	 {
		 System.out.println("Demo5 completed in CC");
	 }
	 
	 public void sample()
	 {
		 System.out.println("sample method is own method of CC");
	 }
}
