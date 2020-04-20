package string;

import java.util.ArrayList;
import java.util.Scanner;
//https://www.acmicpc.net/problem/1062
//1062 - 가르침

public class B_1062 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		StringBuffer [] str = new StringBuffer[N];
		
		for (int i = 0; i < N; i++) {
			StringBuffer tmp = new StringBuffer();
			tmp.append(sc.next());
			tmp.delete(tmp.length()-4, tmp.length());
			tmp.delete(0, 4);
			str[i] = tmp;
		}
		
		//전체 단어에서 사용된 알파벳 체크 
		boolean [] checkAll = new boolean[26];
		//각 단어에서 사용된 알파벳 체크
		ArrayList<Integer>[] checkStr = new ArrayList[N];
		for (int i = 0; i < N; i ++) {
			checkStr[i] = new ArrayList<Integer>();
		}
		
		
	}
}