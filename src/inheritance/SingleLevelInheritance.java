package inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args)
	{
	    Mother m= new Mother();//  created object of class
	    
	    Son s=new Son(); // created object of son class
	    
	    m.nature();// using mothers object calling mothers method
	    s.mobile();// using sons object calling sons methods
	    s.nature();// using sons object calling mothers method
	    
	    Mother.look(); //mother calling its own static methods
	    
	    Son.laptop();// Son calling its own static method
	    
	    Son.look();// Son calling mothers static method
	    
	    

	}

}
