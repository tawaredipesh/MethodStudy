package mathoperation;

public class MathOperations {

	public static void main(String[] args) 
	{
		// Created object of class
		MathOperations m= new MathOperations(); // className objectName = new className
        m.add(); // objectName.methodName--Non Static Regular Method-calling from same class 
	}

public void add()//non static regular method
{
    int a;
    int b;
    int addition;
    a=10;
    b=20;
    addition=a+b;
    System.out.println("addition is " + addition);


	}
}
