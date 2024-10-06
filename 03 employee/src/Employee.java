
public class Employee {

	public String firstName;
	public String lastName;
	public double salary;
	public int practica;

	public Employee(String firstName, String lastName, double salary, int practica) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.practica = practica;
	}

	public void employeeInfo() {
		System.out.println("-------Employee Information------------");
		System.out.println("Name : " + firstName);
		System.out.println("LastName : " + lastName);
		System.out.println("Salary : " + salary);
		System.out.println("Practica : " + practica);
	}

	public void salaryBonus( int salaryBonus) {
		int totalSalary = (int) (this.salary + salaryBonus);
		System.out.println("totalSalar : " + totalSalary);
	}
}
