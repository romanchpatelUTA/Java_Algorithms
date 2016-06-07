package DynamicProgramming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EggDrop {

	// assign total floor and eggs.
	static int floor = 6;
	static int eggs = 2;
	static List<Integer> list=  new ArrayList<>();
	
	// To check minimum number of attemp needed to find if egg will break.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = new int[eggs][floor];
		
		System.out.println(" Minimum number of trials : " + CheckEggDrop(array));
		
 	}

	private static int CheckEggDrop(int[][] array) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < eggs; i++) {
			for (int j = 0; j < floor; j++) {
				if(i==0)
					array[i][j] = j;
				else
				{
					if(i>j)
					{
						array[i][j] =array[i-1][j];
					}
					else
					{
						int min = Integer.MAX_VALUE;
						for (int k = 1; k <= j; k++) {
							min = Math.min(min, 1 + Math.max(array[i-1][k-1], array[i][j-k]));	
						}
						
						array[i][j] = min;
						
					}
				}
			}
		}
		
		
		
		return array[array.length-1][array[0].length-1];
		
	}

}
