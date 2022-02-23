package basicPrograms;

public class Operators {
public static void main(String[]args)
{
//	int x=10;
//	int y=20;
//	System.out.println(x*y);
//	System.out.println(x%y);
//	System.out.println(y/x);
//	
//	float a=10;
//	float b=15;
//	double c=a/b;
//	System.out.println(c);
//	System.out.println(c/b);
	
//	 3) Java Program to print the elements of an array present on even position
	 int a[]= {1,2,3,4,5,6,7};
	 System.out.println("numbers placed at Even position in array are:");
	 for(int i=0; i<a.length; i++)
	 {
		 if(i%2==0)
			 System.out.print(a[i]+" ");
	 }


	
}
}
