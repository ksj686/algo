package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/10987
//10987 - 모음의 개수

public class B_10987 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char [] ch = sc.next().toCharArray();
		int result = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') result ++;
		}
		
		System.out.println(result);
	}
}