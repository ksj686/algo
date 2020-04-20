package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/1032
//1032 - 명령 프롬프트

public class B_1032 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String [] str = new String[N];
		StringBuffer result = new StringBuffer();
		
		
		for (int i = 0; i < N; i++) {
			str[i] = sc.next();
		}
		
		for (int j = 0; j < str[0].length(); j++) {
			boolean flag = true;
			char ch = str[0].charAt(j);
			for (int i = 0; i < N-1; i++) {
				if (str[i].charAt(j) != str[i+1].charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				result.append(ch);
			} else {
				result.append('?');
			}
		}
		
		System.out.println(result);
	}
}