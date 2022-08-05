import java.util.*;
class ClimbStairsWithMinimumMovesMemo {

	public static int solve(int[] step,int index,int len,int[] dp) {
		if(index >= len) {
			return 0;
		}
		if(dp[index]!=0) {
			return dp[index];
		}
		int min = Integer.MAX_VALUE;
		for(int i=1;i<=step[index] && i<len;i++){
				int jump = solve(step,index+i,len,dp);
				if(jump!=Integer.MAX_VALUE && jump+1<min) {
					min = jump+1;
				}
		}
		return dp[index]=min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] step = new int[n];
		for(int i=0;i<n;i++) {
			step[i] = sc.nextInt();
		}
		int[] dp = new int[n+1];
		int noofstep = solve(step,0,n,dp);
		for(int i=0;i<n;i++) {
			System.out.print(dp[i]+" ");
		}
//		System.out.println(noofstep);
	}

}
