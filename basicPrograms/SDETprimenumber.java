  
//prime number logic


// 1) natural number >=1 , 0 & 1 are not prime numbers
// 2) divisible by only 2 numbers, by 1 and itself, count=2

package basicPrograms;
public class SDETprimenumber {
public static void main(String[] args) {
		
	    int num=1;
		int count=0;
		if(num>=1)
		{
		for(int i=1; i<=num; i++)//1
		{
		   if(num%i==0)  
			count++;
		
		}
		  if (count==2)
		{
			System.out.println("prime number");
		}
		  else 
		{
			System.out.println("not a prime number");
		}
		}
		
		else
		{
			System.out.println(" this is not a prime number");
		}
	    }
        }
  


