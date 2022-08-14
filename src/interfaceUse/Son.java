package interfaceUse;

public class Son implements Mother,Father 
{

	public static void main(String[] args) 
	{
       Son s= new Son();
       s.attitue();
       s.money();
       s.look();
       s.nature();
       s.laptop();
       s.love();// calling default method from both interfaces
       Mother.test(); // calling static method from Mother interface
       Father.test(); // calling static method from father interface


	}
    
	public void attitue()
	{
	  System.out.println("Fathers attitude completed in Son Class");	
	}
	
    
	public void money()
	{
		System.out.println("Fathers money completed in Son class");
	}
	
    
	public void nature()
	{
		System.out.println("Mothers nature completed in Son class");
	}
	
	public void look()
	{
		System.out.println("Mothers look completed in Son class");
	}
    
	public void laptop()
	{
		System.out.println("Sons own property");
	}
	
	public void love()
	{
		Mother.super.love(); // calling mothers love method
		Father.super.love();  // calling fathers love method
	}
}
