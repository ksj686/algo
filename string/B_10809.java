package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/10809
//10809 - 알파벳 찾기

public class B_10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		int chToNum;
		int[] alpha=new int[26];
		//-1로 초기화
		for(int i=0;i<26;i++) {
			alpha[i]=-1;
		}
		//ascii (아스키 코드)값 이용하여 해당 알파벳 위치 저장
		for(int i=0;i<str.length();i++) {
			chToNum=(int)str.charAt(i);
			if(alpha[chToNum-97]==-1) alpha[chToNum-97]=i;
		}
		
		for(int i=0;i<26;i++) {
			System.out.print(alpha[i]+" ");
		}
	}
}