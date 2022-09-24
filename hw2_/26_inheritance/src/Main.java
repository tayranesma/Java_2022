
public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		customer.firstName = "Kelly";
		customer.lastName = "Cook";
		customer.id = 1;
		customer.age = 20;
		customer.email ="kelly@email.com"; // buraya özgü field
				
		employee.firstName = "Jenny";
		employee.lastName = "Leek";
		employee.id = 2;
		employee.age = 30;
		employee.salary = 5000; // buraya özgü field
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
		employeeManager.Add();
		employeeManager.List();
		employeeManager.BestEmployee(); //buraya özgü metod
		
		customerManager.Add();
		customerManager.List();
	}

}
