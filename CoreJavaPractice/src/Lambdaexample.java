import java.util.function.Predicate;

class Animal {

	private String species;
	private boolean canhop;
	private boolean canSwim;

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public boolean isCanhop() {
		return canhop;
	}

	public void setCanhop(boolean canhop) {
		this.canhop = canhop;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}

	public Animal(String species, boolean Canhop, boolean canSwim) {
		this.species = species;
		this.canhop = canhop;
		this.canSwim = canSwim;

	}

}

public class Lambdaexample {

	Animal duck = new Animal("Bird", false, true);
	Animal Whale = new Animal("Fish", false, false);

	private static void print(Animal animal, Predicate checker) {
		if (checker.test(animal)) {
			System.out.print(animal  + " can hop");

		}
	}
	public static void main(String args[])
	{
		Lambdaexample example =new Lambdaexample();
		
		
	}
}



