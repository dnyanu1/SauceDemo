package basicPrograms;

public class Fibonacci {
 public static void main(String[] args) {
	  
	int a=0;
	int b=1;
	System.out.print(a+" ");
	System.out.print(b+" ");
	for(int i=0; i<7; i++)
	{
		int c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
	}
}

}

