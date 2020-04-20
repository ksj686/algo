package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/10808
//10808 - 알파벳 개수

public class B_10808 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int [] cnt = new int[26];
		
		//ascii 아스키 코드 사용
		for (int i = 0; i < str.length(); i++) {
			cnt[str.charAt(i)-'a']++;
		}
		for (int i = 0; i < 26; i++) {
			System.out.print(cnt[i] + " ");
		}
	}
}