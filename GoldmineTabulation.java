import java.util.*;
class GoldmineTabulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int[][] dp = new int[n][m];
		for(int i = m-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
				if(i==m-1) {
					dp[j][i] = mat[j][i];
				}
				else if(j==0) {
					dp[j][i] = mat[j][i]+Math.max(mat[j-1][i+1], mat[j][i+1]);
				}
				else if(j==n-1) {
					dp[j][i] = mat[j][i]+Math.max(mat[j+1][i+1], mat[j][i+1]);
				}
				else {
					dp[j][i] = mat[j][i]+Math.max(mat[j+1][i+1],Math.max(mat[j-1][i+1],mat[j][i+1]));
				}
			}
		}
		int max = Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			max = Math.max(dp[i][0], max);
		}
		System.out.println(max);
	}

}
