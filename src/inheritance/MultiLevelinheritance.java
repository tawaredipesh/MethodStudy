package inheritance;

public class MultiLevelinheritance {

	public static void main(String[] args) 
	{
	       // to call non static method
           Son s= new Son();// created object of son class
           
           s.receipe();// using sons object calling grandmothers method
           s.nature();// using sons object calling Mothers method
           s.mobile();// using sons object calling sons own method
           
           // to call static method
           
           Son.stories();// using sons class calling grandmothers static method
           Son.look();// using sons class calling mothers static method
           Son.laptop();// using sons class calling sons(own) static method
           
           Mother m= new Mother(); // created object of class
           m.receipe();// using  mother's class calling grandmothers non static method
           m.nature(); // using mother's class calling mother non static method
          
           Daughter d= new Daughter(); // created object of class
           d.money(); // using daughter class calling father non static method
           
	}

}
