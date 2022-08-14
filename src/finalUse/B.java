package finalUse;

public class B extends A // if any class is final we can't extend that class
{
      public void test() // if any method is a final method then we can't override it
      {
    	  System.out.println("B's test method");
      }
}
