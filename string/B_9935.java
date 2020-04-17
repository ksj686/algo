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

		
		//str.substring(0, bLength-1); 비교해보기
		for(int  i = 0; i < bLength-1; i++) {
			result.append(str.charAt(i));
		}
		
		for (int i=bLength-1;i<str.length();i++) {
			if (str.charAt(i) == bomb.charAt(bLength-1) && result.length() >= bLength-1) {
				if ((result.substring(result.length()-bLength+1)).equals(bomb)){
					result.delete(result.length()-bLength+1, result.length());
				} else 
					result.append(str.charAt(i));
			} else 
				result.append(str.charAt(i));
		}

		if (result.length()>0) {
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
}