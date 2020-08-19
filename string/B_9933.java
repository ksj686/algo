package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/9933
//9933 - 민균이의 비밀번호
//문자열 뒤집기(StringBuffer 활용)

public class B_9933 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String [] str = new String[N];
		String [] reverseStr = new String[N];
		int result = 0;
		int rLength = 0;
		
		for (int i = 0; i < N; i++) {
			str[i] = sc.next();
			StringBuffer sb = new StringBuffer();
			sb.append(str[i]);
			sb.reverse();
			reverseStr[i] = sb.toString();
		}
		
		for (int i = 0; i < N; i++) {
			if (result != 0) break;
			if (reverseStr[i].equals(str[i])) {
				result = i;
				rLength = str[i].length();
				break;
			}
			
			for (int j = i+1; j < N; j++) {
				if (str[j].equals(reverseStr[i])) {
					result = j;
					rLength = str[j].length();
					break;
				}
			}
		}
		
		System.out.println(rLength + " " + str[result].charAt(rLength/2));
	}
}