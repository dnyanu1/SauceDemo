package pack3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Collection {

	public static void main(String[] args) 
	{
		List<Integer> numbers= new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(12);
		numbers.add(152);
		numbers.add(1255);
		System.out.println(numbers);
		numbers.add(2, 88);
		numbers.add(5, 288);
	
		
		System.out.println(numbers);
		System.out.println(numbers.get(numbers.size()-1));
		System.out.println(numbers.size());
		System.out.println(Collections.min(numbers));
		System.out.println(Collections.max(numbers));
		System.out.println(Collections.frequency(numbers, 12));
		
		List<Integer> numbers2= new ArrayList<Integer>();
		numbers2.add(412);
		numbers2.add(2);
		numbers2.add(1452);
		numbers2.add(155);
		numbers2.addAll(numbers);
		System.out.println(numbers2);
		numbers2.equals(numbers);
		
		System.out.println(numbers2.equals(numbers));

	
	}

}
