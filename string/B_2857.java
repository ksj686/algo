package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/2857
//2857 - FBI

public class B_2857 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String [] str = new String[5];
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			str[i] = sc.next();
			if (str[i].contains("FBI")) {
				cnt++;
				System.out.print((i+1) + " ");
			}
		}
		if (cnt == 0) {
			System.out.println("HE GOT AWAY!");
		}
	}
}