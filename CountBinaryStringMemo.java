import java.util.*;
public class CountBinaryStringMemo {
	static int count=0;
	
	public static void solve(int n,String str) {
		if(n==0) {
			count++;
			return;
		}
		if(str.length()==0 || str.charAt(str.length()-1)!='0') {
			solve(n-1,str+'0');
		}
		solve(n-1,str+'1');
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		solve(n,"");
		System.out.println(count);
	}

}
