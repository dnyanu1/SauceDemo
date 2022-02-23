package basicPrograms;

public class PrimeNumbersTill100 {
	
	public static void main(String[] args) {
		int n1=1,n2=100;   //Prime numbers from 1 to 150
		 int i,j;
	System.out.println("Prime numbers between the given numbers are:");	  
		for( i=n1;i<=n2;i++)
		{
		 for( j=2;j<=i;j++)
		 {
		  if(i%j==0)
		  break;
		 }
		
		if(i==j) {
			System.out.print(j+" ");
			}
		 		
		 }}}