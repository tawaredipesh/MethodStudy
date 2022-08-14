package generalisation;

public class Axis implements RBI{

	@Override
	public void deposit() 
	{
		System.out.println("Axis deposit IR-9.8%");
		
	}

	@Override
	public void loan() 
	{
		System.out.println("Axis loan IR-9.4%");
	}

	@Override
	public void transfer() 
	{
	
		System.out.println("Axis have CDM");
	}
     
	public void axisAPP()
	{
		System.out.println("Axis banks own method");
	}
}
