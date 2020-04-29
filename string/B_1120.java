package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/1120
//1120 - 문자열

public class B_1120 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		int min = 50;
		
		for(int i = 0; i <= B.length() - A.length(); i++) {
			int cnt = 0;
			for(int j = 0; j < A.length(); j++) {
				if (A.charAt(j) != B.charAt(j+i)) {
					cnt++;
				}
			}
			if (min > cnt) min = cnt;
		}
		System.out.println(min);
	}
}