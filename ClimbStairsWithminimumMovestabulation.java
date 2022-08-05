import java.util.*;
class ClimbStairsWithminimumMovestabulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] step = new int[n];
		for(int i=0;i<n;i++) {
			step[i] = sc.nextInt();
		}
		int[] dp = new int[n+1];
		Arrays.fill(dp, -1);
		dp[n] = 0;
		for(int i = n-1;i>=0;i--) {
			if(step[i]!=0) {
				int j=1;
				int min= Integer.MAX_VALUE;
				while(j<=step[i] && j+i<=n){
					if(dp[i+j]!=-1) {
					min = Math.min(min,dp[j+i]);
					}
					j++;
				}
				if(min!=Integer.MAX_VALUE) {
					dp[i] = min+1;
				}
			}
		}
		System.out.println(dp[0]);
	}

}
