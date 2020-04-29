//string 정렬
package string;

import java.util.Arrays;
import java.util.Scanner;
//https://www.acmicpc.net/problem/11656
//11656 - 접미사 배열

public class B_11656 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String [] str = new String[S.length()];
		
		for (int i = 0; i < S.length(); i++) {
			str[i] = S.substring(i);
		}
		
		Arrays.sort(str);
		
		for (int i = 0; i < S.length(); i++) {
			System.out.println(str[i]);
		}
	}
}