package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/2902
//2902 - KMP는 왜 KMP일까?

public class B_2902 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String result = str.charAt(0)+"";
		int index = str.indexOf("-");
		while (index != -1) {
			result += str.charAt(index+1);
			index++;
			index = str.indexOf("-",index+1);
		}
		System.out.println(result);
	}
}