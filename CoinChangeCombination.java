import java.util.*;
class CoinChangeCombination {
	static int[][] dp;
	public static int solve(int[] arr,int index,int amt,int target) {
		if(index>=arr.length || amt > target) {
			return 0;
		}
		if(amt == target) {
			return 1;
		}
		if(dp[index][amt]!= -1) {
			return dp[index][amt];
		}
		if(amt + arr[index]<=target) {
			dp[index][amt] = solve(arr,index,amt+arr[index],target) + solve(arr,index+1,amt,target);
		}
		else {
		dp[index][amt] = solve(arr,index+1,amt,target);
		}
		
		return dp[index][amt];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		dp = new int[n][target+1];
		for(int i=0;i<n;i++) {
			Arrays.fill(dp[i], -1);
		}
		System.out.println(solve(arr,0,0,target));
				
	}
}
