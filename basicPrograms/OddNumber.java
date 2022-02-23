package basicPrograms;

public class OddNumber {
	public static void main(String[] args) {
		  int n1=1,n2=50;
		  int i,j;
		for( i=n1;i<=n2;i++)
		{
		 for( j=2;j<=i;j++)
		 {
		  if(i%j==0)
		  break;
		 }
		 if(i==j)
		 System.out.println(j);
		}
		 }

}
