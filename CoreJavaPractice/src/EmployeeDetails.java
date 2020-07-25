import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeDetails {

	private String name;
	private int id;

	public EmployeeDetails(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		
		return "EmployeeDetails>>>>"+name+" Id"+id;
	}

	public static void main(String args[]) {

		List<EmployeeDetails> list = new ArrayList<>();
		list.add(new EmployeeDetails("Manu", 1234));
		list.add(new EmployeeDetails("Santhu", 5555));

		list.add(new EmployeeDetails("Harshu", 6666));

		list.add(new EmployeeDetails("Paddy", 9999));
		
		Collections.sort(list, Comparator.comparing((EmployeeDetails e)->e.getId()));
		
		list.stream().forEach(e->System.out.println(e));

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
