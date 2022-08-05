import java.util.*;
public class CoinChangeCombinationTabulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int[] dp = new int[target+1];
		dp[0] = 1;
		for(int i=0;i<n;i++) {
			for(int j=arr[i];j<=target;j++) {
				dp[j] += dp[j-arr[i]];
			}
		}
		System.out.println(dp[target]);
	}

}
