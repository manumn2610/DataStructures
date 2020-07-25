
 public class TestStringImmutable {

	/*public void findAnswer(boolean check) {
		int answer;
		int onlyOneBranch;
		if (check) {
			onlyOneBranch = 1;
			answer = 1;
		} else {
			answer = 2;
		}
		System.out.println(answer);
		//System.out.println(onlyOneBranch); // DOES NOT COMPILE }
	}*/
	
	

public static void main(String args[]) {
	
	
	String string = "animals"; 
	System.out.println(string.substring(3));// mals
	System.out.println(string.substring(string.indexOf('m'))); // mals
	System.out.println(string.substring(3, 4)); // m
	System.out.println(string.substring(3, 7)); // mals
	
	
	String a = "abc"; 
	 String b = a.toUpperCase();
	  b = b.replace("B", "2").replace('C', '3');
	  System.out.println("a=" + a);
	   System.out.println("b=" + b);

	 
	
	String s1 = "1";
	String s2 = s1.concat("2");
	s2.concat("3");
	System.out.println(s2);
 
	

		System.out.println("In Main"+s1);
		System.out.println("In Main"+s2);

	}

}

