import java.util.*;
class GoldmineMemoPlusRec {
	static int[][] dp;
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
		dp = new int[n][m];
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int maxval = solve(mat,i,0);
			max = Math.max(maxval,max);
		}
		System.out.println(max);
	}
	public static int solve(int[][] mat,int r,int c) {
		if(r<0 || c<0 || r>=mat.length || c>=mat[0].length) {
			return 0;
		}
//		int max = Integer.MIN_VALUE;
		if(dp[r][c]!=0) {
			return dp[r][c];
		}
		int upperdiagonal = solve(mat,r-1,c+1);
		int forward = solve(mat,r,c+1);
		int lowerdiagonal = solve(mat,r+1,c+1);
		return dp[r][c] = mat[r][c]+Math.max(upperdiagonal,Math.max(forward, lowerdiagonal));
		
	}
}
