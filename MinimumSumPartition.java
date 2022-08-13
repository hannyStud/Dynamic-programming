import java.io.*;
import java.util.*;
class MinimumSumPartition {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while(t-->0)
             {
                 int n = sc.nextInt();
                 int A[] = new int[n];
                 for(int i = 0;i<n;i++)
                     A[i] = sc.nextInt();
                 System.out.println(minDifference(A,n));

	}
}
       static int diff = Integer.MAX_VALUE;
         static int sum = 0;
         public static void solve(int[] arr,int n,int index,int sum1){
             if(index>=n){
                 return;
             }
             if(Math.abs(sum - 2*sum1)<diff){
                 diff = Math.abs(sum- 2*sum1);
             }
             solve(arr,n,index+1,sum1+arr[index]);
             solve(arr,n,index+1,sum1);
         }
       public static int minDifference(int arr[], int n) { 
       	    // Your code goes here
       	    for(int i: arr){
       	        sum += i;
       	    }
       	   //solve(arr,n,0,0);
       	   int s = sum/2;
       	   boolean[][] dp = new boolean[n+1][sum+1];
       	   dp[0][0] = true;
       	   for(int i=1;i<=n;i++){
       	       for(int j=0;j<=sum;j++){
       	           if(j==0){
       	               dp[i][j] = true;
       	           }else if(j>=arr[i-1]){
       	               dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
       	           }else{
       	               dp[i][j] = dp[i-1][j];
       	           }
       	       }
       	   }
       	   for(int i=0;i<=sum/2;i++){
       	       if(dp[n][i]){
       	           diff = Math.min(diff,sum - (2*i));
       	       }
       	   }
       	   return diff;

}
}


