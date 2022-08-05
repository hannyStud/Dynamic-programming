import java.util.*;
class ClimbStairsWithVariableJump {

	public static int solve(int[] step,int index,int len,int[] dp) {
		if(index == len) {
			return 1;
		}
		if(dp[index]!=0) {
			return dp[index];
		}
		int count = 0;
		for(int jump = 1;jump<=step[index];jump++) {
			if((jump+index) <= len) {
				count += solve(step,jump+index,len,dp);
			}
		}
		
		return dp[index] = count;
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
		System.out.println();
		System.out.println(noofstep);
	}

}
