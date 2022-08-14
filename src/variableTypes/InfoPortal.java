package variableTypes;

public class InfoPortal {

	public static void main(String[] args)
	{
		EmployeeInfo Dheeraj= new EmployeeInfo(); // created object of employee class
		Dheeraj.emp_name= "Dheeraj Chavan";
		Dheeraj.emp_address= "Pune";
		Dheeraj.emp_age= 22;
		Dheeraj.emp_bloodgroup= "A+ve";
		Dheeraj.emp_gender= 'M';
		Dheeraj.emp_weight= 79.46f;
		
		EmployeeInfo Pankaj= new EmployeeInfo();
		Pankaj.emp_name="Pankaj Taware";
		Pankaj.emp_address="Pune";
		Pankaj.emp_age=21;
		Pankaj.emp_bloodgroup="B+ve";
		Pankaj.emp_gender= 'M';
		Pankaj.emp_weight=75.69f;
		
		
        Dheeraj.emp_info();
        Pankaj.emp_info();
	}

}
