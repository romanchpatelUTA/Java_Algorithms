package CTCI;

public class CoinCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5,10,25};
		int n = 35;
		FindCombinations(arr, n, "");
		
		
	}

	private static void FindCombinations(int[] arr, int n,String sum) {
		// TODO Auto-generated method stub
		if(n<0)
		{
			return;
		}
		
		
		if(n == 0)
		{
			System.out.println(sum);
			return;
		}
		
		for (int i : arr) {
			FindCombinations(arr,n-i,sum+ "," +i);
		}
		
	}

}
