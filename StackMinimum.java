package algoPractice;

import java.util.ArrayList;
import java.util.Stack;

public class StackMinimum {
	
	static Stack<Integer> stack1 = new Stack<>();
	static Stack<Integer> stack2 = new Stack<>();
	static Stack<Integer> sortedStack = new Stack<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 int[] array = {4,5,1,3,5,10};

		 for (int i = 0; i < array.length; i++) {
			 insert(array[i]);
		}		 
		 System.out.println(FindMinimum());
 
	}

	private static int FindMinimum() {
		// TODO Auto-generated method stub
		return stack2.peek();
	}

	private static void insert(int i) {
		if(stack2.isEmpty())
		{
			stack1.push(i); 
			stack2.push(i);
		}
		else if(i < stack2.peek())
		{
			stack2.push(i);
			stack1.push(i);
		}
	
		else if(i>stack2.peek())
		{
			stack1.push(i);
			stack2.push(stack2.peek());
		}
	}
}


