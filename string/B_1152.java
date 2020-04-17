package string;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1152
//1152 - 단어의 개수

public class B_1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		//문자열 앞뒤 공백제거
		str=str.trim();
		int cnt=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') cnt++;
		}
		//공백문자열은 예외
		if(str.length()==0) cnt=0;
		System.out.println(cnt);
	}
}