//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    
// } Driver Code Ends


class Solution{
    int[][] dp;
	public int perfectSum(int arr[],int n, int sum) 
	{  int tab[][] = new int[n + 1][sum + 1];
 
    // Initializing the first value of matrix
    tab[0][0] = 1;
 
    for(int i = 1; i <= sum; i++)
        tab[0][i] = 0;
 
 
    for(int i = 1; i <= n; i++)
    {
        for(int j = 0; j <= sum; j++)
        {
             
            // If the value is greater than the sum
            if (arr[i - 1] > j)
                tab[i][j] = tab[i - 1][j]%1000000009;
 
            else
            {
                tab[i][j] = (tab[i - 1][j] % 1000000009 +
                            tab[i - 1][j - arr[i - 1]]%1000000009)%1000000009;
            }
        }
    }
 
    return tab[n][sum]%1000000007;
	} 
}