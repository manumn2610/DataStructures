
public class Overloading {
	
	/*public void print(int name) {
		
		System.out.println("name"+name);
	}*/
	
public void print(Integer value) {
		
	System.out.println("value"+value);
		
	}

public static void main(String args[])
{
	
	Overloading o=new Overloading();
			o.print(8);
	
}

}
