package basicPrograms;

public class ArrayArena {

	public static void main(String[] args) {
		
		
// 1) Java Program to print the elements of an array
//		
//	char a[]= {'A','B','C','D','E','F'}; 
//    String S[]= {"Apple","Bat","Cat"} ;
//	System.out.println("Elements in an array are : ");
//		 for (int i=0; i<a.length; i++)
//		 {
//			 System.out.print(a[i]+" ");
//		 }
//		 System.out.println();
//    System.out.println("Elemets in Array S are ");
//		 for(int i=0; i<S.length; i++)
//		 {
//			 System.out.print(S[i]+" ");	
//		 }
//		 System.out.println();
//		 
//		String Name[]= {"Vinay","Kishore","Rahaul"};  //Enhanced For loop
//		for(String Arr:Name)
//		{
//			System.out.print(Arr+" ");
//		}
//    
//	int b[]= {5654,4,54,35,45,64,5};	
//	System.out.println("Elements in an array are : ");
//	 for (int i=0; i<b.length; i++)
//	 {
//		 System.out.print(b[i]+" ");
//	 }
//		System.out.println();
//	System.out.println("---------------------End of the Program---------------"); 
//		
//		
//		
// 2) Java Program to print the elements of an array in reverse order
//		
//		System.out.print("Reverse order is ");
//		int a[]= {5,8,6,9,3,2};
//		for(int i=a.length-1; i>=0; i--)   //last index= length - 1
//		{
//			System.out.print(a[i]+ ",");
//		}
//	System.out.println("---------------------End of the Program---------------"); 	
//		
//		
//		
//2) Java Program to print the elements of an array present on odd position
//		
//	 int a[]= {1,2,3,4,5,6,7};
//	 System.out.println("numbers placed at Odd position in array are:");
//	 for(int i=0; i<a.length; i++)
//	 {
//		 if(i%2!=0)
//			 System.out.print(a[i]+" ");
//	 }
//  System.out.println("-----------------End of the Program---------------"); 
//		
//		
//		
// 3) Java Program to print the elements of an array present on even position
//		 int a[]= {1,2,3,4,5,6,7};
//		 System.out.println("numbers placed at Even position in array are:");
//		 for(int i=0; i<a.length; i++)
//		 {
//			 if(i%2==0)
//				 System.out.print(a[i]+" ");
//		 }
//	System.out.println("-----------------End of the Program---------------");	
//          
//		 Even position numbers
//		
//		 int a[]= {1,2,3,4,5,6,7};
//		 System.out.println("Even numbers in array are:");
//		 for(int i=0; i<a.length; i=i+2)
//		 {
//				 System.out.print(a[i]+" ");
//		 }
// System.out.println("-----------------End of the Program---------------");
//		     
//    System.out.println(); // to give space between 2 outputs
//		 
//           Odd position numbers
//		
//		 int a[]= {1,2,3,4,5,6,7};
//		 System.out.println("Odd numbers");
//		 for(int i=1; i<a.length; i=i+2)
//		 {
//				 System.out.println(a[i]);
//		 }
//	System.out.println("-----------------End of the Program---------------");	
//		
//             
//		
// 5) Java Program to print the largest element in an array
//		
//		int a[]= {1,2,3,4,55,96,7,128};
//		int max=0; 
//		int b=0; //lets assume largest number is at Position '0'
//		for(int i=0; i<a.length; i++)
//		{
//			if(a[i]>max)
//			max=a[i];
//		  if (a[i]==max)
//			  b=i; 
//		}
//		System.out.println("Largest number in an array is " +max+ " and its position is "+b);	
//  System.out.println("-----------------End of the Program---------------");		
//		
//		
//		
// 5)Smallest Number in an Array and its position
//		
//	int a[]= {-11,2,3,4,-5,0,6,10};
//		//        0  1 2 3 4 5 6 7
//	int min=a[0]; //lets assume smallest number is '0'
//	int b=0;     // lets assume smallest number ia at position 0 
//	for(int i=0; i<a.length; i++)
//	{
//		if(a[i]<min)
//			min=a[i];
//			
//		if(a[i]==min)
//			b=i;
//	}
// System.out.println("Smallest number is " +min+ " and its position is " +b);
// System.out.println("-----------------End of the Program---------------");
// 
// 
//		for(int i=0; i<a.length; i++)
//		{
//			if(a[i]==min)
//				System.out.println(i);
//		}		
// System.out.println("-----------------End of the Program---------------");	
//		
//		
//		
//6) Java Program to sort the elements of an array in ascending order
//		
//		int a[] = {5, 2, 8, 7, 1};     
//	        int temp = 0;    
//	            
//	        //Displaying elements of original array    
//	        System.out.println("Numbers of original array: ");    
//	        
//	        for (int i = 0; i < a.length; i++)
//	        {     
//	            System.out.print(a[i] + " ");    
//	        }    
//	            
//	        //Sort the array in ascending order    
//	       
//	        for (int i = 0; i < a.length; i++)
//	        {     
//	            
//	        	for (int j = i+1; j < a.length; j++) 
//	              {     
//	              if(a[i] > a[j]) //(5>2)
//	               {    
//	                   temp = a[i];    //temp=5 // 2 //
//	                   a[i] = a[j];   // a[i]=2  ////
//	                   a[j] = temp;    // a[j]=5  // 2 //
//	               }     
//	            }     
//	        }   
//	          
//	        System.out.println( );    
//	               
//	        //Displaying elements of array after sorting    
//	System.out.println("Numbers of array in ascending order: ");    
//	    for (int i = 0; i < a.length; i++)
//	     {     
//	            System.out.print(a[i] + " ");    
//	     }    
//  System.out.println("-----------------End of the Program---------------");		 
//		
//		
//		
//		
//7) Java Program to sort the elements of an array in descending order
//		
//		    int a[]= {4,5,5,8,9,1,10};
//		    int temp=0;
//		System.out.println("Numbers of original array:");
//		
//		for(int i=0; i<a.length; i++)
//			{
//			System.out.print(a[i]+" ");
//			}
//		
//		  System.out.println();
//		   
//	 for(int i=0; i<a.length; i++)
//		{
//			 for(int j=i+1; j<a.length; j++) 
//			 {
//				if (a[i] < a[j])
//			    {
//				   temp=a[i];
//			          a[i]=a[j]; // array change
//				   a[j]=temp;
//				}
//			 }
//	     }
//		  System.out.println("Numbers of array in descending order: ");
//		   for(int i=0; i<a.length; i++)
//		{
//		System.out.print(a[i]+ " ");
//	
//		}
//		   System.out.println();
//		   System.out.print("2nd smallest Number in an array : ");
//	 	System.out.println(a[a.length-2]);
// System.out.println("-----------------End of the Program---------------");
//		
//		
//		
// 8) Java Program to Print Odd and Even Numbers from an array
//		
//		 int a[]= {1,2,3,4,5,6,7};
//		 System.out.println("Odd numbers in array are:");
//		 for(int i=0; i<a.length; i++)
//		 {
//			         if(a[i]%2!=0)
//		       System.out.print(a[i]+" ");
//		 }
//		 
//		  System.out.println();
//		  
//		 System.out.println("Even numbers in array are:");
//		 for(int i=0; i<a.length; i++)
//		 {
//			         if(a[i]%2==0)
//		       System.out.print(a[i]+" ");
//		 }
//		System.out.println();
// System.out.println("-----------------End of the Program---------------");
//		
//		
//		
//		
//9) Java Program to copy all elements of one array into another array
//
//		int a[]= {1,2,5,6,5,56,8,14,8,2,9,1,6,1,5};
//		
//		int c[]=new int[a.length];
//		
//		System.out.println("numbers in a new array are:");
//		for(int i=0; i<a.length;  i++)
//		{
//			c[i]=a[i];
//			System.out.print(c[i]+" ");
//        }
//		System.out.println();
// System.out.println("-----------------End of the Program---------------");		
//		
//		
//		
//          int a[]= {25,555,55,89,96,65};
//		  int c[]=new int[a.length];
//		System.out.println("Numbers is original array 'a' are :");
//
//		for(int i=0; i<a.length;  i++)
//		{ 
//			System.out.print(a[i]+" ");
//		}	
//		
//		System.out.println();
//		System.out.println();
//		System.out.println("Numbers is new array 'c' are :");
//		for(int i=0; i<a.length;  i++)
//		{ 
//            c[i]=a[i];
//			System.out.print(c[i]+" ");
//		}
//		System.out.println();
// System.out.println("-----------------End of the Program---------------");		
//		
//		
//10) Java Program to find the frequency of each element in the array
////		
//		int a[]={1,1,2,5,6,8,8,8};
//		 int count=0;
//		int f[]=new int [a.length];
//		 System.out.println("Element" +" | "+"Frequency");
//		for(int i=0; i<a.length; i++)
//		{ 
//			count=1;
//			for(int j=i+1; j<a.length; j++)
//			{
//				if(a[i]==a[j])
//				{	
//			   count++;
//		       f[j] = 1;
//				}
//			}
//			if(f[i]!=1)
//				System.out.println(a[i]+"       |      "+count);
//			}
//	System.out.println("-----------------End of the Program---------------");		
//		
//		
//		
//11) Java Program to print the duplicate elements of an array
//		
//		int a[]={1,1,2,5,18,8,8,18};
//		 int count=0;
//		int f[]=new int [a.length];
//	System.out.println("Duplicate elements of an array are :");
//		for(int i=0; i<a.length; i++)
//		{ 
//			count=1;
//			for(int j=i+1; j<a.length; j++)
//			{
//				if(a[i]==a[j])
//					{
//					count++;
//		           f[j] = 1;
//					}
//			}
//			if(count>1 && f[i] != 1)
//				System.out.print(a[i]+" ");
//			}
//		System.out.println();
//	System.out.println("-----------------End of the Program---------------");	
//		
//		
//		
//		
//	 int a[] = {1, 2, 8, 3, 2, 2, 2, 5, 1};  
//	 int f[] = new int [a.length];  //Array f will store frequencies of element
//	 int visited = -1;  
//	 for(int i = 0; i < a.length; i++)
//	 {  
//         int count = 1;  
//       for(int j = i+1; j < a.length; j++)
//        {  
//	    if(a[i] == a[j])
//	      {  
//	         count++;  //To avoid counting same element again  
//	         f[j] = visited;  
//	      }  
//	     }  
//	          if(f[i] != visited)  
//	          f[i] = count;  
//	     }  
//	          //Displays the frequency of each element present in array  
//	   System.out.println("---------------------------------------");  
//	   System.out.println(" Element | Frequency");  
//	   System.out.println("---------------------------------------");  
//	      for(int i = 0; i < f.length; i++)
//	     {  
//	         if(f[i] != visited)  
//	    System.out.println("    " + a[i] + "    |    " + f[i]);  
//	     }  
//	    System.out.println("----------------------------------------");  
//		
//	      
//		
//
//		
//		
//12) Java Program to Find 2nd Largest Number in an array	
//		
//	    int a[]= {4,5,5,8,91,1,10};
//	    int temp=0;
//	System.out.println("Numbers of original array:");
//	
//	for(int i=0; i<a.length; i++)
//		{
//		System.out.print(a[i]+" ");
//		}
//	
//	  System.out.println();
//	   
// for(int i=0; i<a.length; i++)
//	{
//		 for(int j=i+1; j<a.length; j++) 
//		 {
//			if (a[i] > a[j])
//		    {
//			   temp=a[i];
//		           a[i]=a[j];
//			   a[j]=temp;
//			}
//		 }
//     }
//	  System.out.println("Numbers of array in descending order: ");
//	   for(int i=0; i<a.length; i++)
//	{
//	System.out.print(a[i]+ " ");
//
//	}
//	   System.out.println();
//	   System.out.print("2nd Largest Number in an array : ");
// 	System.out.println(a[a.length-2]);
				


	}
    }