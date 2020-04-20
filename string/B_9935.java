//StringBuffer delete 메소드
package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/9935
//9935 - 문자열 폭발

public class B_9935 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String bomb = sc.next();
		int bLength = bomb.length();
		StringBuffer result = new StringBuffer();

		//문자열폭탄의 길이 -1 위치부터 시작
		result.append(str.substring(0, bLength - 1));
		
		for (int i = bLength - 1; i < str.length(); i++) {
			//맨뒤에 글자 하나 붙여주기
			result.append(str.charAt(i));
			//맨 뒤의 글자와 문자열폭탄 맨 뒤의 글자가 같고  문자열 폭탄의 길이보다 길거나 같고 마지막 부분이 문자열 폭탄과 같으면 지워줌
			if (str.charAt(i) == bomb.charAt(bLength - 1) && result.length() >= bLength
					&& (result.substring(result.length() - bLength)).equals(bomb)) {
				result.delete(result.length() - bLength, result.length());
			}
		}

		if (result.length() > 0) {
			System.out.println(result);
		} else {
			System.out.println("FRULA");
		}
	}

	
	//메모리 초과 풀이
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		String bomb = sc.nextLine();
		
		while (str.contains(bomb)) {
			str = str.replaceAll(bomb, "");
		}
		
		if (str.isEmpty()) {
			System.out.println("FRULA");
		} else {
			System.out.println(str);
		}
	}
	*/
	
	//시간초과 풀이
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		String bomb = sc.nextLine();
		
		int limit = str.length()/bomb.length();
		for (int i = 0; i < limit; i++) {
			str = str.replace(bomb, "");
		}
		
		if (str.isEmpty()) {
			System.out.println("FRULA");
		} else {
			System.out.println(str);
		}
	}
	*/
}