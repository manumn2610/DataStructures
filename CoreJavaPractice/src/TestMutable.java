
class NotImmutable {

	private StringBuilder builder;

	public NotImmutable(StringBuilder builder) {

		// this.builder = builder;
		// added to make it as immutable
		this.builder = new StringBuilder(builder);

	}

	public StringBuilder getBuilder() {
		return new StringBuilder(builder);
	}

}

public class TestMutable {

	public static void main(String args[]) {
		StringBuilder builder = new StringBuilder("Initial");
		NotImmutable mutable = new NotImmutable(builder);

		StringBuilder gotBuilder = mutable.getBuilder();

		gotBuilder.append("Added after Creation");

		System.out.println("GotBuilder>>>>>" + gotBuilder);
	}

}