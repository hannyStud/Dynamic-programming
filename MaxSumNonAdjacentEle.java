import java.util.*;
public class MaxSumNonAdjacentEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int inc = arr[0];
		int exc = 0;
		for(int i=1;i<n;i++) {
			int innc = exc+arr[i];
			int exxc = Math.max(inc,exc);
			
			inc = innc;
			exc = exxc;
		}
		System.out.println(Math.max(inc, exc));
	}

}
