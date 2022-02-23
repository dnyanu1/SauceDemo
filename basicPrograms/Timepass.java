package basicPrograms;

public class Timepass
{  public static void main(String[] args) {
	
    int num=0;
	int count=0; 
	
	if(num<=1)
		
	{
    System.out.println("not a prime number");
	}
	else 
	{
	for(int i=1; i<=num; i++)
	{
     if(num%i==0) 
     {
		count++;
	 }
	 }
	
	  if (count==2)
	{
		System.out.println("prime number");
	}
	  else
	{
	    System.out.println(" not a prime number");
	}
	}
	}
    }

