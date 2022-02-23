package basicPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		  
		int n=121;
		int sum=0;
		int r;
		int temp=n;
		while(n>0)
		{
			r=n%10;
			
			sum=(sum*10)+r;
			
			n=n/10;
			}
		 if(temp==sum)
		 {
		System.out.println("palindrome number");
		 }
		else
		{
			System.out.println("not palindrome");
		}
	}

}
