package basicPrograms;

public class ForLoop2 {
	int a=4;  //instance variable
	static int b=4;
	public static void main(String[] args)

	{
		char i;   //local varibale
		int count=0;
		System.out.println("Letters in English Alphabet are:");
		for(i='A'; i<='Z'; i++)
		{
			 System.out.print(i+" ");
			 count++;
	} 
		System.out.println();
		System.out.println();
		int c=2;
		int n=count-c;
		System.out.print("number of letters between given letters :");
		System.out.println(" "+n);
	
//		char i;
//		System.out.println("Letters in English Alphabet in reverse order are:");
//		for(i='Z'; i>='A'; i--)
//		{
//			 System.out.print(i+" ");
//	}
		
	}}

