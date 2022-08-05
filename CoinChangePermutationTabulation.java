import java.util.*;
class CoinChangePermutationTabulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] =sc.nextInt();
		}
		int amt = sc.nextInt();
		int[] dp = new int[amt+1];
		dp[0] = 1;
		for(int i=0;i<=amt;i++) {
			for(int j=0;j<n;j++) {
				if(arr[j] <= i) {
					dp[i] += dp[i-arr[j]];
				}
			}
		}
		System.out.println(dp[amt]);
	}

}
