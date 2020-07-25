
public class Arrays {

	boolean chk = true;

	public void voidTestArrays(String array1[], String array2[]) {

		if (array1.length == array2.length) {

			for (int i = 0; i < array1.length; i++) {

				if (array1[i].equals(array2[i])) {
					continue;
				} else {
					chk = false;
					break;
				}

			}
		}

		if (chk == true) {
			System.out.println("Arrays are equal");
		} else
			System.out.println("Not equal");

	}

	public static void main(String args[]) {

		String array1[] = { "abc", "", "cde" };
		String array2[] = { "abc", "cde", "cde" };

		Arrays arrTest = new Arrays();
		
		for(String items:array1)
			System.out.println(items);
		
		

		System.out.println(array1[1].equals(array2[1]));
		arrTest.voidTestArrays(array1, array2);

	}

}
