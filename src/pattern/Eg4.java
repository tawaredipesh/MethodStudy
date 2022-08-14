package pattern;

public class Eg4 {

	public static void main(String[] args) {
	 //*****
	 //****
	 //***
	 //**
	 //*
		
	//rows-->5 star-->5
	int star=5;
	
	//outer for loop
	
	for(int i=1; i<=5; i++)//rows-->for loop
	  {
		   for (int j=1; j<=star; j++)//column-->for loop
		   {
			   System.out.print("*");
		   }
		   star--;
		      System.out.println();
	  }
      
	}

}
