package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/1543
//1543 - 1543

public class B_1543 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int result = 0;
		String str = sc.nextLine();
		String find = sc.nextLine();
		
		int fromIndex = 0;
		int tf = str.indexOf(find, fromIndex);
		while (tf != -1) {
			result++;
			fromIndex = tf + find.length();
			tf = str.indexOf(find, fromIndex);
		}
		
		System.out.println(result);
	}
}