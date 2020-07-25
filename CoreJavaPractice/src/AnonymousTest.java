import java.util.Comparator;

public class AnonymousTest {
	
	
	
	Thread thread =new Thread(new Runnable()
			{

				@Override
				public void run() {
					
					System.out.println("Thread Started");
					
				}
		
		
			});
	
	
	Comparator comparator=new Comparator() {

		@Override
		public int compare(Object o1, Object o2) {
			
			String obj1=(String)o1;
			
			return 0;
		}
		
		
	};

	public static void main(String[] args) {
		
		AnonymousTest test =new AnonymousTest();
		test.thread.start();

	}

}
