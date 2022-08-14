package variableTypes;

public class EmployeeInfo 

{
   // Name,address,blood group,gender,weigh and age.
	String emp_name;
	String emp_address;
	String emp_bloodgroup;
	char emp_gender;
	float emp_weight;
	int emp_age;
	
	public void emp_info()
	{
		System.out.println("===========================");
		System.out.println("Employee name is "+ emp_name);
		System.out.println("Employee address is "+emp_address);
		System.out.println("Employee bloodgroup is "+emp_bloodgroup);
		System.out.println("Employee gender is "+emp_gender);
		System.out.println("Employee weight is "+ emp_weight);
		System.out.println("Employee age is "+ emp_age);
		
	}
	
	
}
