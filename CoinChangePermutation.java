import java.util.*;
class CoinChangePermutation {
	static int count=0;
	public static void solve(int[] arr,int amt,int n,int sum) {
		if(sum > amt) {
			return;
		}
		if(sum == amt) {
			count++;
		}
		for(int i=0;i<n;i++) {
			if(sum+arr[i] <= amt) {
				solve(arr,amt,n,sum+arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int amt = sc.nextInt();
		solve(arr,amt,n,0);
		System.out.println(count);
	}

}
