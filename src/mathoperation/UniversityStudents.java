package mathoperation;

public class UniversityStudents {

	public static void main(String[] args) 
	{
		UniversityStudents us= new UniversityStudents();// created object of a class
		us.studentInfo(); // calling non static method from same class
		us.studentInfo("Katraj","PU768545","Arts","Test",'M',2020,99.99f);

	}
    // name,PRN,branch,department,gender, pass out year,weight
	
	public void studentInfo()// method without parameter
	{
		String name;
		name="Velocity";
		
		String PRN;
		PRN="PU12345";
		
		String branch;
		branch="Engineering";
		
		String Department;
		Department="Civil";
		
		char gender;
		gender='F';
		
		int passoutyear;
		passoutyear=2019;
		
		float weight;
		weight=78.88f;
		
		System.out.println("===================================");
		System.out.println("My name is "+ name);
		System.out.println("My PRN number is "+ PRN);
        System.out.println("My branch is "+ branch);
        System.out.println("My department is "+ Department);
        System.out.println("My gender is "+ gender);
        System.out.println("My passout year is "+ passoutyear);
        System.out.println("My weight is "+ weight);
        System.out.println("===================================");
        
	}
	// name,PRN,branch,department,gender,pass out year,weight
	
	public void studentInfo(String name,String PRN,String branch,String Department,char gender,int passoutyear, float weight)
	//method with parameter
	{
		System.out.println("=====================================");
		System.out.println("My name is "+name);
		System.out.println("My PRN number is "+ PRN);
		System.out.println("My branch is "+ branch);
		System.out.println("My gender is "+gender);
		System.out.println("My passout year "+passoutyear);
		System.out.println("My weight is "+ weight);
		System.out.println("=====================================");
		
		
	}
	
	
	
}
