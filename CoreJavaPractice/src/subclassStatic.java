
class ParentStatic {

	static {

		int rand = 0;
		System.out.println("Random in parentClass" + rand + Math.random());
		System.out.println(">>>>>>>>>>>>>>>" + rand + Math.random());
		System.out.println("****************" + rand + Math.random());

	}

	public ParentStatic() {

		System.out.println("Constructor in parentclass called");
	}

}

public class subclassStatic extends ParentStatic {

	static {

		System.out.println("In subclass static1");

		System.out.println("In subclass static2");
	}

	public subclassStatic() {

		System.out.println("In the subclass constructor");
	}

	public static void main(String args[]) {
		
		System.out.println("Main ");
		subclassStatic subclass=new subclassStatic();
		
		

	}

}