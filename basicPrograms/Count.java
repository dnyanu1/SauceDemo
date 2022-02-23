package basicPrograms;

public class Count {
 public static void main(String[] args) {
	
	 int num=45;
	 int count=0;
	 for(int i=1; i<=num; i++)
	 {
		 if(num%i==0)
		 { count++;
		 System.out.print(i+","); 
		 }
     }
	 System.out.println("\n");
	 System.out.println(count); 
}
}
