package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/2908
//2908 - 상수

public class B_2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		sb1.append(str1);
		sb2.append(str2);
		//stringbuffer를 이용해 문자열 거꾸로 출력
		str1 = sb1.reverse().toString();
		str2 = sb2.reverse().toString();
		
		if (Integer.parseInt(str1) > Integer.parseInt(str2))
			System.out.println(str1);
		else
			System.out.println(str2);
	}
	
	//또다른 풀이법. int형으로 입력받은후 숫자 뒤집기
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		
		A=reverse(A);
		B=reverse(B);
		if(A>B) System.out.println(A);
		else System.out.println(B);
	}
	
	public static int reverse(int num) {
		return num/100+(num/10%10)*10+(num%10)*100;
	}
	*/
}