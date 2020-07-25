
public class CalcLengthofNumber {
	
	public void length(int num)
	{
		
	/*	int n=num;
		int count=0;
		while(n>0)
		{
			
			n=n/10;
			count++;
		}*/
		int length = (int)(Math.log10(num)+1);
		
		System.out.println("lenth"+length);
		
	}

	public static void main(String args[]) {
		CalcLengthofNumber len=new CalcLengthofNumber();
		len.length(800);
		

	}

}
