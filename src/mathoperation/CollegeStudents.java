package mathoperation;

public class CollegeStudents {

	public static void main(String[] args) 
	{
		CollegeStudents cs= new CollegeStudents();
		cs.studentInfo();
		cs.StudentMark("Pankaj",21,'M',85.50f,'5',"Manual");
        cs.StudentMark("Dheeraj", 22,'M',65.5f,'6',"Social Work");
        
        
        

	}
//name,age,gender,weight,Roll Number Class name
	public void studentInfo()// method without parameter
	{
		String name;
		name="Dipesh";
		
		int age;
		age=24;
		
		char gender;
		gender='M';
		
		float weight;
		weight=69.50f;
		
		int Rollnumber;
		Rollnumber=15;
		
		String classname;
		classname="Automation";
		
	
		
		System.out.println("===============================");
		System.out.println("My name is "+ name);
		System.out.println("My age is "+ age);
		System.out.println("My gender is "+gender);
		System.out.println("My weight is "+ weight + "Kg");
		System.out.println("My Roll Number is "+ Rollnumber);
		System.out.println("My class name is "+ classname);
		System.out.println("================================");
		}
	// Math,English, Science
	
	public void StudentMark(String name,int age,char gender,float weight,int Rollnumber, String Classname)
	{
		
		
		System.out.println("=================================");
		System.out.println("My name is "+ name);
		System.out.println("My age is "+ age);
		System.out.println("My gender is "+gender);
		System.out.println("My weight is "+ weight + "Kg");
		System.out.println("My Roll Number is "+ Rollnumber);
		System.out.println("My class name is "+ Classname);
		System.out.println("==================================");
		}
		
		
		
	
}
