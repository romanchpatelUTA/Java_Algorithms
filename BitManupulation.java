package algoPractice;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BitManupulation {

	public static void main(String[] args) {
		String b = Integer.toBinaryString(12);
		System.out.println(b);
		int value = Integer.parseInt(b);
		
		//System.out.println(findNthBit(value, 2));
		//System.out.println(ClearBit(12, 2));
		int n = Integer.parseInt("10000000000",2);
		int m = Integer.parseInt("10011",2);
		System.out.println(Integer.toBinaryString( insert(m,n,2,6)));
	}

	private static int findNthBit(int value, int n) {
		// TODO Auto-generated method stub
		int answer = (value & (1 << (n-1)));
		if(answer!= 0)
			return 1;
		else
			return 0;
		
	}
	
	
	private static int ClearBit(int value, int n)
	{
		System.out.println(Integer.toBinaryString(-1 << 5));
		int shift = (1 << (n))-1;
		value = value&shift;
		return value;
	}
	
	private static int ClearNthBit(int value, int n)
	{
		int shift = (1<<n);
		value &= ~shift;
		return value;
	}
	
	private static int insert(int m, int n, int i, int j)
	{
		int left =  (-1<<j+1);
		int right = (1 <<i)-1;
		System.out.println("left "+ Integer.toBinaryString(left));
		System.out.println("right"+ Integer.toBinaryString(right));
		System.out.println("and operation "+ Integer.toBinaryString(left | right));
		
		int mask = n & (left | right);
		System.out.println("mask : "+ Integer.toBinaryString(mask));
		
		 m = m<< i; 
		
		return m | mask;
	}
	
	
	
}
