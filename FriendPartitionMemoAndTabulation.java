import java.util.*;
public class FriendPartitionMemoAndTabulation {

	public static int solve(int n) {
		if(n==0) return 1;
		if(n<0) return 0;
		return solve(n-1)+(n-1)*solve(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println(solve(n));
		int[] dp = new int[n+1];
		dp[1] = 1;
		dp[2] = 2;
		for(int i=3;i<=n;i++) {
			dp[i] = dp[i-1]+dp[i-2]*(i-1);
		}
		System.out.println(dp[n]);
	}

}
