package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/3613
//3613 - Java vs C++
//어려운 문제는 아닌데 문제가 약간 기준이 모호

public class B_3613 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char [] ch = str.toCharArray();
		boolean checkJ = false, checkC = false;
		StringBuffer sb = new StringBuffer();
		
		if ((int)str.charAt(0) <= (int)'Z' || str.charAt(0) == '_') {
			System.out.println("Error!");
			return;
		}
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '_') {
				checkC = true;
				if (i + 1 < ch.length && (int) ch[i+1] >= (int)'a' && (int) ch[i+1] <= (int)'z') {
					char tmp = (char)((int) ch[i+1] + (int)'A' - (int)'a');
					sb.append(tmp);
					i++;
				} else {
					System.out.println("Error!");
					return;
				}
			} else if ((int) ch[i] >= (int)'A' && (int) ch[i] <= (int)'Z') {
				checkJ = true;
				char tmp = (char)((int) ch[i] + (int)'a' - (int)'A');
				sb.append('_' + "" + tmp);
			} else {
				sb.append(ch[i]);
			}
		}
		
		if (checkC && checkJ) {
			System.out.println("Error!");
			return;
		}
		
		if (!checkC && !checkJ) {
			System.out.println(str);
			return;
		}

		System.out.println(sb);
	}
}