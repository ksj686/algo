package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/1157
//1157 - 단어의 개수

public class B_1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] alpha=new int[26];
		int max=0;
		int cnt=0;
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		//대소문자 구분이 없고 결과값은 대문자이므로 대문자로 통일시킴 
		str=str.toUpperCase();
		
		//앞파벳의 ascii (아스키 코드)값을 이용하여 alpha 배열에 각 문자 개수 카운트
		for(int i=0;i<str.length();i++) {
			alpha[(int)str.charAt(i)-65]++;
		}
		//가장 많이 사용된 알파벳
		for(int i=1;i<26;i++) {
			if(alpha[max]<alpha[i]) max=i;
		}
		//가장 많이 사용된 알파벳이 여러개인지 검증
		for(int i=0;i<26;i++) {
			if(alpha[i]==alpha[max]) cnt++;
		}
		
		if(cnt>1) System.out.println("?");
		else System.out.println((char)(max+65));
	}
}
