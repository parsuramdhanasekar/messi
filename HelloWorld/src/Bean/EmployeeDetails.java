package Bean;

import java.nio.file.DirectoryIteratorException;
import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDetails {
	ArrayList<Employee> employeelist = new ArrayList<>();

	public void addEmployee(Employee employee) {
		employeelist.add(employee);
		
	}

	
	public void removeEmployee(int id, String name) {
		Iterator<Employee> iterator;
		for (iterator = employeelist.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if ((employee.getId() == id) || (employee.getName().equals(name))) {
				iterator.remove();

			}

		}
	}

	public void showEmployee() {
		for (Employee employeee1 : employeelist) {

			
			
			
			
			System.out.println(employeee1.getId() + "" + employeee1.getName());
		}
	}

	public void searchEmployeeeByName(String name) {

		for (Employee employee : employeelist) {

			if (employee.getName().equals(name))
				System.out.println("Employee Name:" + employee.getName());

		}
	}

	public void getHigestSalary(int salary) {

		// }
	}

	public static void main(String[] S) {
		EmployeeDetails employees = new EmployeeDetails();
		Employee e1 = new Employee(1, "Messi", 10000);
		Employee e2 = new Employee(2, "Mbappe", 20000);
		Employee e3 = new Employee(3, "Pogba", 30000);
		employees.addEmployee(e1);
		employees.addEmployee(e2);
		employees.addEmployee(e3);
		System.out.println();
		employees.showEmployee();
		employees.removeEmployee(1, "Messi");
		System.out.println();
		employees.showEmployee();
		employees.searchEmployeeeByName("Pogba");

	}
	

}
