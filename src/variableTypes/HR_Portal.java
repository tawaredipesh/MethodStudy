package variableTypes;

public class HR_Portal 
{

	public static void main(String[] args)
	{
		Employee Sachin= new Employee();// created object of employee class
		Sachin.emp_name="Sachin T";
		Sachin.emp_id="IND10";
		Sachin.emp_desg="Batsman";
		Sachin.emp_sal=1234.123f;
		Sachin.emp_age=41;
		Sachin.emp_gender='M';
		
		Employee Virat= new Employee();
		Virat.emp_name="Virat K";
		Virat.emp_id="IND18";
		Virat.emp_desg="AllRounder";
		Virat.emp_sal=14665.65f;
		Virat.emp_age=32;
		Virat.emp_gender='M';
		
		Employee Dhoni= new Employee();
		Dhoni.emp_name="M.S. Dhoni";
		Dhoni.emp_id="IND07";
		Dhoni.emp_desg="Wicketkeeper";
		Dhoni.emp_sal=15600.56f;
		Dhoni.emp_age=48;
		Dhoni.emp_gender='M';

		
		Sachin.emp_info();
		Virat.emp_info();
        Dhoni.emp_info();
	}

}















