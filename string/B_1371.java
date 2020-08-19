package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/1371
//1371 - 가장 많은 글자
//bufferedreader와 scanner의 EOF 처리방법 ( ctrl + z)
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;

public class B_1371 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		String str = "";
		int [] ch = new int[26];
		
//		while ((str = br.readLine()) != null) {
		while (sc.hasNextLine()) {
			str = sc.nextLine();
			for (int i = 0; i < str.length(); i++) {
				if ((int)str.charAt(i) >= (int)'a' && (int)str.charAt(i) <= (int)'z') {
					ch[str.charAt(i)-'a']++;
				}
			}
		}
		
		int max = 0;
		for (int i = 0; i < 26; i++) {
			if (max < ch[i]) {
				max = ch[i];
			}
		}
		
		for (int i = 0; i < 26; i++) {
			if (max == ch[i]) {
				System.out.print((char)(i+'a'));
			}
		}
	}
}