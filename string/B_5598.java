package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/5598
//5598 - 카이사르 암호
//toCharArray 메소드로 string을 간단하게 char 배열로 변환할 수 있다.
//System.out.print로 결과를 굳이 이어붙이지 않고 한글자씩 출력할 수 있다.

public class B_5598 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char [] ch = sc.next().toCharArray();
//		int loop = (int)'Z' - (int)'A' + 1;
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] += ch[i] -3 < 'A' ? 23 : -3;
			//System.out.print(ch[i]);
		}
		System.out.println(ch);
	}
}