import java.util.*;
class CountEncodingMemo {

//	public static int countEncoding(String str) {
//		if(str.length()==0) {
//			return 1;
//		}
//		int count = 0;
//		if(str.length()==1) {
//			char ch = str.charAt(0);
//			if(ch=='0') {
//				return count;
//			}else {
//				return ++count;
//			}
//		}else {
//			char ch = str.charAt(0);
//			if(ch == '0') {
//				return count;
//			}else {
//				String roq = str.substring(1);
//				count += countEncoding(roq);
//			}
//			String ch12 = str.substring(0,2);
//			String roq = str.substring(2);
//			int val12 = Integer.valueOf(ch12);
//			if(val12 <= 26) {
//				count += countEncoding(roq);
//			}
//		}
//		return count;
//	}
	static int[] dp;
	public static int countEncoding(String str,int index) {
		if(index == str.length()) {
			return 1;
		}
		if(str.charAt(index)=='0') {
			return 0;
		}
		if(dp[index]!=0) {
			return dp[index];
		}
		int count =0;
		count  = countEncoding(str,index+1);
		if(index <= str.length()-2 && Integer.valueOf(str.substring(index,index+2))<=26) {
			count += countEncoding(str,index+2);
		}
		return dp[index] = count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		dp = new int[str.length()+1];
		System.out.println(countEncoding(str,0));
	}

}
