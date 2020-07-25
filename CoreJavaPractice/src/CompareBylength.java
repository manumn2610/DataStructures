import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareBylength {

	
	  private static void sortStringListByLength(List<String> list) {
	        System.out.println("-- sorting list of string --");
	        Collections.sort(list, Comparator.comparing(String::length));
	        list.forEach(System.out::println);
	    }
	
	public static void main(String args[])
	{
		
		List<String> list=new ArrayList<>();
		list.add("manu");
		list.add("Harshini");

		list.add("Padmanabhan");

		list.add("Kav");

		list.add("So");

		
		CompareBylength calc=new CompareBylength();
		calc.sortStringListByLength(list);
		System.out.println(list);
		
		
		
		
	}
	
}
