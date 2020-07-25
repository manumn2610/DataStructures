
public class StaticClassExample2 {

	/*
	 * public static void Number(int num) {
	 * 
	 * num = 5; }
	 * 
	 * public static void main(String args[]) {
	 * 
	 * int num=8;
	 * 
	 * Number(9);
	 * 
	 * System.out.println(num);
	 * 
	 * }
	 */

	public static void Speak(String name) {

		name = "Manu";
	}

	public static void main(String args[]) {

		String name = "Harshi";
		Speak("Paddy");

		System.out.println(name);
	}

}
