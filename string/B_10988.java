//string 거꾸로
//혹은 앞부분과 뒷부분 비교
package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/10988
//10988 - 팰린드롬인지 확인하기

public class B_10988 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		String reverseStr = sb.reverse().toString();
		
		if (str.equals(reverseStr)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}