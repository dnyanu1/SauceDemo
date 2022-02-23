package basicPrograms;

public class PrimeNumberKadak {
	public static void main(String[] args) {
		
		int a=27;
		int b=63;
//		int count=0;
		for(int c=1; c<=a && c<=b; c++)
		{
			if(a%c==0 && b%c==0)
				
				System.out.print(c);
				 
			}
	

	}

}
