package DynamicProgramming;

import java.util.regex.Matcher;
// minimum swap required to get 3 G(girl) together.
public class MinSwapRequired {
	public static void main(String args[]) {
		String s = "GXBBGBBBXGG";
		int m = 3;
		
		System.out.println(MinSwapUtil(s, m));
		

	}

	public static int MinSwapUtil(String s, int m) {
		char[] chars = s.toCharArray();
		int minSwap = Integer.MAX_VALUE;
		
		for (int i = 0; i < chars.length; i++) {
		
			if (chars[i] == 'G') {
				int count=0;
				int sumOfSwap = 0;
				int currentIndex = i;
				for(int j = i + 1; j < chars.length; j++) {					
					if(chars[j] == 'G' && count <=m-1)
					{
						sumOfSwap = sumOfSwap+ (j-currentIndex-1);
						count++;
						currentIndex = j;
					}
					if(count==(m-1))
					{
					minSwap = Math.min(minSwap, sumOfSwap);
					}
				}
			}

		}

		return minSwap;

	}
}
