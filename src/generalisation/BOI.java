package generalisation;

public class BOI implements RBI 
{

	@Override
	public void deposit() {
		System.out.println("BOI deposit IR-5.9%");
		
	}

	@Override
	public void loan() {
		System.out.println("BOI Loan IR-8.5%");
		
	}

	@Override
	public void transfer() {
		System.out.println("SBI have NEET,IMPS,RTGS,CDM");
		
	}

	public void BOIStarAPP()
	{
		System.out.println("BOI's own method");
	}
		
}
    
	

