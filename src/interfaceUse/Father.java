package interfaceUse;

public interface Father 
{

	void attitue();
	void money();
	 
	default void love() 
	{
		System.out.println("Fathers Love");
	}
	
	static void test()
	{
		System.out.println("Fathers test");
	}
}
