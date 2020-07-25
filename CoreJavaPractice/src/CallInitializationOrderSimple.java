 class InitializationOrderSimple extends parentclass{
	private String name = "Torchie";
	{
		System.out.println(name);
	}
	private static int COUNT = 0;
	static {
		System.out.println(COUNT);
	}
	static {
		COUNT += 10;
		System.out.println(COUNT);
	}

	public InitializationOrderSimple() {
		System.out.println("constructor");
	}
}
 
 class parentclass {
	 
	 static {
		 
		 System.out.println("In the parentClass Static Block");
	 }
	 
	 public parentclass() {
		 
		 System.out.println("Parentclass constructor");
	 }
	 
	 {
		 
		 System.out.println("Instantiation block in Parant class ");
	 }
	 
	 
 }

public  class CallInitializationOrderSimple {
	public static void main(String[] args) {
		System.out.println("Main>>>>>>>>>>");
		new InitializationOrderSimple();
	}

}
