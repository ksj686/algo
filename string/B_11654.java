//다시볼필요x
package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/11654
//11654 - 아스키 코드

public class B_11654 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		
		//ascii (아스키 코드)값
		int result=(int)str.charAt(0);
		
		System.out.println(result);
	}
}