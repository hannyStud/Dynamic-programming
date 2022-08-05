import java.util.*;
class ClimbStairsWithVariableJumpWithTabulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] step = new int[n];
		for(int i=0;i<n;i++) {
			step[i] = sc.nextInt();
		}
		int[] dp = new int[n+1];
		dp[n] = 1;
		for(int i = n-1;i>=0;i--) {
			if(step[i] != 0) {
				int k=1;
				while(k<=step[i] && k+i<=n) {
					dp[i] += dp[i+k];
					k++;
				}
			}
		}
		for(int i=0;i<=n;i++) {
			System.out.print(dp[i]+" ");
		}
	}

}
