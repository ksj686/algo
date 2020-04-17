package string;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1475
//1475 - 방 번호

public class B_1475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		
		System.out.println(maxNum(N));
	}
	
	static int maxNum(String N) {
		int[] arr = new int[9];
		
		for (int i = 0; i < N.length(); i++) {
			int tmp = Character.getNumericValue(N.charAt(i));
			
			if(tmp != 9) {
				arr[tmp]++;
			} else {
				arr[6]++;
			}
		}
		if (arr[6]%2 == 0)
			arr[6]/=2;
		else
			arr[6] = arr[6]/2 + 1;
		Arrays.sort(arr);
		
		return arr[8];
	}
}