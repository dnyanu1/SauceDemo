package basicPrograms;

public class GCD {

	public static void main(String[] args) {
		
		int a=27;
		int b=63;
		int GCD=1;
		for(int c=1; c<=a && c<=b; c++)
		{
			if(a%c==0 && b%c==0)
			
				GCD=c; 
			}
		System.out.print(GCD);

	}

}
