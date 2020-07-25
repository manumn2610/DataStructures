
public class StringBuilderTest {
	
	public static void main(String args[])
	{
		
		StringBuilder s=new StringBuilder();
		
		for(char c='a'; c<='z';c++)
		{
			s.append(c);
			
			
		}
		
		System.out.println("s"+s);
		
		s.insert(3, "-");
		System.out.println("s >>>>>>"+s);

		
	}

}
