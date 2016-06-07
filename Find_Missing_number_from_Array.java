package algoPractice;

import java.util.HashMap;
import java.util.Stack;

public class Find_Missing_number_from_Array {
	
	public static void main(String args[])
	{
		int[] array = {5,4,7,0,1,3,2,0,9,10};
		
		//nextMinReplace(array);
		int number = 3;
		int n = array.length;
		//FindSumFromArray(array,number);
		//reverse(array, number);
		//reverse(array, n-number);
		//reverse(array,n-number+1);
		findMissingPos(array);
	}
	
	
	private static void reverse(int[] array,int number) {
		
		int temp = 0;
		int n = array.length;
		for (int i = 0; i < n-1; i++) {
			if(i<=(n/2)-1)
			{
				temp  = array[i];
				array[i] = array[n-i-1];
				array[n-i-1] = temp;	
			}
		}
		int limit = n-number;
		for (int i = 0; i <limit-1; i++) {
			if(i<=(limit/2)-1)
			{
				temp  = array[i];
				array[i] = array[limit-1-i];
				array[limit-1-i] = temp;	
			}
			}
		
		limit = n-limit;
		for (int i = n-limit +1; i < array.length; i++) {
			if(i<= (limit/2)-1)
			{
				temp  = array[i];
				array[i] = array[n-i-1];
				array[n-i-1] = temp;	
			}
		}
		System.out.println(array[0]);
		// TODO Auto-generated method stub
		
	}


	public static void nextMinReplace(int[] array)
	{
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		int temp = 0;
		
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]>array[j])
				{
					temp = array[j];
					array[i]= temp;
					System.out.println(array[i]);
					i++;
					j=i;
				}
			}
		}
	}
	
	
	public static void findMissingPos(int[] array)
	{
		int sum = 0,squaredSum = 0;
		int n = array.length;
		double a,b=0;
		for (int i = 0; i < array.length; i++) {
			sum =sum + array[i];
			squaredSum = squaredSum + (array[i]*array[i]);
		}
		
		int actualSum = (n*(n+1))/2;
		int actualSquaredSum = ((n*(n+1)*(2*n +1))/6);
		
	    int APlusB= actualSum -sum;
	    
	    int ASqBSq = actualSquaredSum - squaredSum;
	    
	    int APlusBSquare = APlusB* APlusB;
	    
	    int AB = (APlusBSquare - ASqBSq);
	    
	    int AMinusBSquare =  ASqBSq -AB;
	    
	    double AMinusB = Math.sqrt( AMinusBSquare);
	    
	    a = (APlusB- AMinusB)/2;
	    
	    b = APlusB - a;
	    System.out.println(a);
	    System.out.println(b);
	}
	
	//given unsorted array. contains numbers 1-100. 2 pos empty. 
	
}
