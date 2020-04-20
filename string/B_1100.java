package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/1100
//1100 - 하얀 칸

public class B_1100 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String [] chess = new String[8];
		int result = 0;
		for (int i = 0; i < 8; i++) {
			chess[i] = sc.nextLine();
		}
		
		//i+j의 값이 짝수이면 하얀칸
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((i + j)%2 == 0 && chess[i].charAt(j) == 'F')
					result++;
			}
		}
		System.out.println(result);
	}
}