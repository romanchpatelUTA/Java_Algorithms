package algoPractice;

import java.util.Stack;

public class Queue_using_Stack {
	static Stack<Integer> stack1 = new Stack<Integer>();
	
	
	static Stack<Integer> stack2 = new Stack<Integer>();
	
	static int[] array = {1,2,3,4,5,6};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Push(array);
		System.out.println(Pop());
		push(5);
		
		System.out.println(Pop());

	}

	private static void push(int i) {
		// TODO Auto-generated method stub
		stack1.push(i);
		
	}

	private static int Pop() {
		if(stack2.isEmpty())
		{
			while(!stack1.isEmpty())
			{
				stack2.push(stack1.pop());
			}
		}
		
		// TODO Auto-generated method stub
		return stack2.pop();
		
		
	}

	private static void Push(int[] array) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < array.length; i++) {
			stack1.push(array[i]);
		}
	}
}
