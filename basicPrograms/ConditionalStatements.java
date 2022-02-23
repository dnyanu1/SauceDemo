package basicPrograms;

public class ConditionalStatements {

public static void main(String[] args)
{
	// grading system
	int Marks=47;
    if(Marks>80)
    {
  System.out.println("Grade=A"); 	
    	
    }
    else if(Marks>60)
    {
   System.out.println("Grade=B");
    }
    else if(Marks>40)
    {
    System.out.println("Grade=C");
    }
    else
    {
    	System.out.println("Grade=D");
    	
    }
    //Even and Odd
    int num=7;
	if (num % 2 == 0)
	{ 
		  System.out.println("num is an even number");
	}
	else
	{
		System.out.println("num is an odd number");
	}
  	System.out.println("End of the Program");
  	
  	// blood donation eligibity
  	int Age=11;
  	int Weight=58;
  	if(Age>20)
  	{
  		System.out.println("Check the weight now");
  		{
  		if(Weight>50)
  		{
  	   System.out.println("Person is eligible for blood donation");
  		
  		
  		}
  	}
  	}
}}