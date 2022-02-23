package basicPrograms;

public class StringsBasicPrograms {

	public static void main(String[] args) {
		
		
//  String a="I am ";
//  String b="Elon";
//  String c=" Tesla";
//  String d=" Musk";
//  String f="Elon";
//  System.out.println(a+b+c+d);
//  System.out.println(b.concat(d));
//  String D= a+b+c+d;
//  System.out.println(D);
//  System.out.println(D.length());
//  System.out.println(b.charAt(3));
//  System.out.println(c.trim());
//  
//   String e= new String("Elon");
//   System.out.println(e);
//   System.out.println(b==f); //location of strings is same
//   System.out.println(b!=e);
//   System.out.println(b==e); // location of strings is not same
//   System.out.println(b.equals(e)); //content in both the strings is similar
	
		
		
//1) Java Program to count the total number of characters in a string
	
//	String x="Elon";
//	String y="Elon Musk";
//	System.out.println("Number of characters in the string x is : "+x.length());
//	System.out.println();
//	System.out.println("Number of characters in the string y is : "+y.length());
//	
//	System.out.println();
//	
//	String z="Globalisation";
//	System.out.println("String z has "+ (z.length()-y.length()) +" characters more than String y");
//	System.out.println("-------------End of the Program---------------");
	
		
		
//2)Java Program to count the total number of vowels and consonants in a string
	
//		 String z="abcdefghijklmnopqrstuvwxyz";
//		int V=0;
//		int C=0;
//		z = z.toLowerCase();
//		System.out.println(z);
//		    for(int i=0; i<z.length(); i++)  // i<=z.length()-1
//		{
//		if(z.charAt(i)=='a'|| z.charAt(i)=='e' || z.charAt(i)=='i'|| z.charAt(i)=='o' || z.charAt(i)=='u')
//		{
//			V++;
//		}  
//		     
//		  else if(z.charAt(i) >= 'a' && z.charAt(i)<='z')
//		 {
//		   C++; 
//		 }
//		 }
//     System.out.println("Number of Vowels : " + V++);    
//	 System.out.println("Number of consonants : " + C++);
//	 System.out.println("-------------End of the Program---------------");	
		
		
		
//3)Java Program to remove all the white spaces from a string
		 
//		 String x="   Liberalisation       ";
//		 String y=" Privatisation ";
//		 String z=" Globalisation  ";
//		  System.out.println(x.trim()+", "+y.trim()+" and "+z.trim()+" (LPG)");
//		 
//		 		 System.out.println(z.trim());
//		
//		
//	  String a="Privatisation";
//      System.out.println(a.toUpperCase());
//      System.out.println();
//      System.out.println(a.toLowerCase());
//	System.out.println("-------------End of the Program---------------");	
		
		
		
//4)Java Program to replace lower-case characters with upper-case and vice-versa
		
//		String s="LoVe THe WaY LIe";
//		char temp;
//		 for(int i=0; i<s.length(); i++)
//		 {	 
//			 temp=s.charAt(i);
//			 
//			 if (s.charAt(i)>='A' && s.charAt(i)<='Z')
//			 {
//				temp=Character.toLowerCase(temp);
//			 }
//			 
//			 else if(s.charAt(i)>='a' && s.charAt(i)<='z')
//			 {
//				 temp=Character.toUpperCase(temp);
//			 }
//			 
//		       System.out.print(temp);
//	     }
//		 System.out.println();
//		 System.out.println("-------------End of the Program---------------");
		
	
		
//		String s="YAshvant";
//		char temp=s.charAt(0);
//		System.out.println(Character.toLowerCase(temp));
//		
		
		
 // 5)Java Program to replace the spaces of a string with a specific character
		
//	String a="Globalisation   Liberalisation Privatisation   ";	
//	char b='%';
//	System.out.println("Before : "+a);
//    System.out.println();
//	
//    a=a.replace(' ', b);
////    a=a.replace(' ', '%');
//    
//    System.out.println("After : "+a);
//    
//  System.out.println("-------------End of the Program---------------");
		
		
		
//	6)	Java Program to find Reverse of the string
		
//		String z="Selenium";
//      System.out.println("Original string : "+z);
//		
//		String a="";   // assume 'a' is a reversed string
//	              
//		for(int i=z.length()-1; i>=0; i--)
//		{
//			 a =  a + z.charAt(i);
//		}
//	System.out.println("Reverse of the string : "+a);
//	System.out.println("-------------End of the Program---------------");
		
		  
		//OR
		
//		String z="Selenium";
//	    System.out.println("Original string : "+z);
//	    System.out.print("Reverse of the string : "); //Used print instead of println
//            for(int i=z.length()-1; i>=0; i--)
//			{
//				System.out.print(z.charAt(i));         //Used print instead of println
//			}
//		 System.out.println();                  //next line
//    System.out.println("-------------End of the Program---------------");
		
		 
		
		
// 7) Java program to find the duplicate characters in a string
		
//		String z="*Lo&ca&li%sat&&ionl*";
//		z=z.toLowerCase();
//		int count=0;
//		int f[]=new int [z.length()];
//		System.out.println("Duplicate Characters in the given string are : ");
//		  for(int i = 0; i <z.length(); i++)
//		  {  
//			  count = 1;
//	      for(int j = i+1; j<z.length(); j++)
//	    {  
//	       if(z.charAt(i) ==z.charAt(j) && z.charAt(i) !=' ') 
//	    {  
//	      count++;  
//	      f[j]=1;
//	    }  
//	    }   
//		     
//	      if(count>1 && f[i] != 1)  	
//	            System.out.print(z.charAt(i)+"  ");  
//	    } 
//		  System.out.println();
//		 System.out.println("-------------End of the Program---------------");
		
		
		
//	8) Java Program to find the frequency of characters
		
//		String z="*Lo&ca&li%sat&&ionl*";
//		z=z.toLowerCase();
//		int count=0;
//		int f[]=new int [z.length()];
//		System.out.println("Elements | Frequency ");
//		  for(int i = 0; i <z.length(); i++)
//		  {  
//			  count = 1;
//	      for(int j = i+1; j<z.length(); j++)
//	    {  
//	       if(z.charAt(i) ==z.charAt(j) && z.charAt(i) !=' ') 
//	    {  
//	      count++;  
//	      f[j]=1;
//	    }  
//	    }   
//		     
//	      if(count>1 && f[i] != 1)  	
//	            System.out.println(z.charAt(i)+"        |     "+count);  
//	    } 
//		  System.out.println();
//		 System.out.println("---End of the Program---");
		
		
		
//	9) Java Program to separate the Individual Characters from a String
		
//		String z="Localisation";
//		System.out.println("Individual Characters from a given String are: ");
//		
//		for(int i=0; i<z.length(); i++)
//		{
//			System.out.print(z.charAt(i)+" ");
//		}
//		System.out.println();
//		 System.out.println("-------------End of the Program---------------");
		
		
		
//10) Java Program to swap two string variables without using third variable
		
//		String z="java";
//       String x="python";
//         System.out.println("Before swapping :");
//        System.out.println("z= "+ z + " and x= "+ x);
//		     
//        z=z+x; 
//		       
//		x=z.substring(0, z.length()-x.length());
//		System.out.println(x.length());
//		z=z.substring(x.length());
//		System.out.println();
//		  System.out.println("After Swapping : ");
//	  System.out.println("z= "+ z + " and x= "+ x);
//		 System.out.println("------------------End of the Program---------------");
		
		
        
        
//10) Java Program to swap two string variables using third variable
        
//        String z="Manual";
//        String x="Automation";
//        System.out.println("Before swapping :");
//        System.out.println("z= "+ z + " and x= "+ x);
//        String a=x;
//        x=z;
//        z=a;
//        System.out.println("After Swap : ");
//        System.out.println("z= "+ z + " and x = "+ x);
//        System.out.println("---------------------End of the Program---------------"); 
//        
		
		
//		String x="  Globali    yshd   ";
//		System.out.println(x.trim());//removes the white spaces from both the ends in a string
		
//		String z="Localisation";
//		String T="localisation";
//		System.out.println(z.substring(5));
//		 System.out.println(z.equals(T));
//		 System.out.println(z.equalsIgnoreCase(T));
//		 System.out.println(z.startsWith("L"));
//		 System.out.println(z.startsWith("l"));
//		 System.out.println(z.endsWith("n"));
//		 System.out.println(z.concat(T));
		
		
//	  String Y=z.substring(z.length()-6);
//		z=z.substring(z.length());
////		System.out.println(z);
//
//         System.out.println(Y);
   
//   String str = "      Geeks     for    Geeks        ";
//   // Call the replaceAll() method
//   str = str.replaceAll("\\s", ""); // removes all the white spaces in a string
//  
//   System.out.println(str);
		
		
//  11)Reverse String in Java letter by letter
//			
//		String z="String in Java Word"; 
//		          
//		String a="";
//		
//		for(int i=z.length()-1; i>=0; i--)
//		{
//			 a =  a + z.charAt(i);
//		}
//		System.out.println("Reverse of the string : "+a);
//		System.out.println("---------------------End of the Program---------------"); 
//		
//		
//		
//		
// 12)Reverse String in Java Word by Word use split method
//		 
//		String z= "Selenium webdriver with Java";
//		  int a = z.length()-1;  
//		  int end= z.length();    
//
//         while (a>0)
//		  {
//		  while ( z.charAt(a)!=' '&& a>=0)
//		  {
//			  a-- ;
//			  if(a==-1)
//			   break;
//		  }
//		  System.out.print(z.substring(a+1,end)+" ");
//		  end = a;
//		  a--;
//		  }
//         System.out.println();
// System.out.println("---------------------End of the Program---------------"); 
//		
//		
//13)split each word in a String // Array of words 
//		
//		String S="Selenium Webdriver with Python";
//		String A[]= S.split(" "); //creates an array of words in an array
//		
//		System.out.println(A[2]);
//		System.out.println(A[A.length-1]);
//		
//		for (int i=0; i<A.length; i++)
//		{
//			System.out.print(A[i]+" ");
//		}
//		System.out.println();
//		
//		for (int i=A.length-1; i>=0; i--)
//		{
//			System.out.print(A[i]+" ");
//		}
//			
//		for(String B: A)  //Enhanced for loop
//		{
//		System.out.println(B);
//		}
//		
//		String D="Selenium Webdriver with Python";
//		String d[]= D.split(" with ");
//		for (int i=0; i<d.length; i++)
//		{
//			System.out.print(d[i]+" ");
//		}
	
		
          }}

