import java.io.*;
import java.util.*;
public class CuttingRod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	      int t = sc.nextInt();
	      while (t-- > 0) {
	          int n = sc.nextInt();
	          int[] arr = new int[n];
	          for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

	          Solution ob = new Solution();
	          System.out.println(ob.cutRod(arr, n));
	      }

	}

}
class Solution{
  int[] dp;
  // public int solve(int[] price,int[] len,int n,int index){
  //     if(index>=price.length){
  //         return 0;
  //     }
  //     if(dp[index][n]!=0){
  //         return dp[index][n];
  //     }
  //     int a = 0;
  //     if(len[index]<=n){
  //         a = price[index]+solve(price,len,n-len[index],index);
  //     }
  //     int b = 0+solve(price,len,n,index+1);
  //     return dp[index][n] = Math.max(a,b);
  // }
  public int cutRod(int price[], int n) {
      //code here
      // int[] len = new int[n+1];
      // for(int i=0;i<n;i++){
      //     len[i] = i+1; 
      // }
      dp = new int[n+1];
      // return solve(price,len,n,0);
      for(int i=1;i<=n;i++){
          for(int j=0;j<=n;j++){
              if(j>=i){
                  dp[j] = Math.max(dp[j],price[i-1]+dp[j-i]);
              }
          }
      }
      return dp[n];
  }
}
