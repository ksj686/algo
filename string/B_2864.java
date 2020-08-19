package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/2864
//2864 - 5와 6의 차이
//replace 써서 해도 됨

public class B_2864 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int max=0, min=0;
		String min1 = "", max1 = "", min2 = "", max2 = "";
		StringBuffer sbMin = new StringBuffer();
		StringBuffer sbMax = new StringBuffer();
		
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if (ch != '5' && ch != '6') {
				sbMin.append(ch);
				sbMax.append(ch);
			} else {
				sbMin.append('5');
				sbMax.append('6');
			}
		}
		min1 = sbMin.toString();
		max1 = sbMax.toString();
		
		sbMin = new StringBuffer();
		sbMax = new StringBuffer();
		
		for (int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);
			if (ch != '5' && ch != '6') {
				sbMin.append(ch);
				sbMax.append(ch);
			} else {
				sbMin.append('5');
				sbMax.append('6');
			}
		}
		min2 = sbMin.toString();
		max2 = sbMax.toString();
		
		min = Integer.parseInt(min1) + Integer.parseInt(min2);
		max = Integer.parseInt(max1) + Integer.parseInt(max2);
		
		System.out.println(min + " " + max);
	}
}