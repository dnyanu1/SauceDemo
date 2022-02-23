

//logic 0 and 1 are not prime numbers
//number divisible by 1 and itself only 

package basicPrograms;

public class PrimeNo {  
		 public static void main(String args[]){  
		  int i,m=0,flag=0;    
		  int n=11;  
		  m=n/2;   
		  if(n==0||n==1) //0 & 1 are not prime numbers 
		  {
		   System.out.println(n+" is not prime number");    
		  }
		  else
		  {
		   for(i=2;i<=m;i++)
		   {    
		    if(n%i==0)
		    {   
		     System.out.println(n+" is not prime number");    
		     flag=1;    
		     break;    
		    }    
		   }    
		   if(flag==0)  { System.out.println(n+" is prime number"); }
		  }
		}  
		} 



