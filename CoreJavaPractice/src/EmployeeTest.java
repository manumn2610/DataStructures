import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	private String name;
	private int empid;

	public Employee(String name, int empid) {
		super();
		this.name = name;
		this.empid = empid;
	}

	public Employee() {

	}
	
	

	Comparator<Employee> comparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {

			return o1.getEmpid() - o2.getEmpid();
		}

	};
	
	@Override
	
	public String toString() {
		
		return "EmployeeDetals"+name+"empId"+empid;
	}
	

}

public class EmployeeTest {
	public static void main(String args[]) {

		Employee empComp = new Employee();

		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee("Manu", 1234));
		emp.add(new Employee("Paddy", 1111));
		emp.add(new Employee("Harshini", 1000));


		Collections.sort(emp, empComp.comparator);
		System.out.println(emp);

	}

	
}
