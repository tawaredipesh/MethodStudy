package controlStatments;

public class Nested1 {

	public static void main(String[] args) {
		// if card is inserted then enterPin
		// if pin is correct then --> transaction success
		// else incorrect Pin, transaction is failed
		// else,please insert card
		
		boolean card=true;
		String PIN="1234";
		
		if(card==true)
		{
			System.out.println("Please enter PIN");
			
			if(PIN=="123")
			{
				System.out.println("Transaction success,please collect cash");
			}
			else
			{
				System.out.println("incorrect PIN,transaction failed");
			}
		}
		
		else 
		{
			System.out.println("Insert your card");
		}

	}

}
