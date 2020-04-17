package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/5622
//5622 - 다이얼

public class B_5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int result=0;
		int[]alpha=new int[26];
		int num=3;
		
		for(int i=0;i<23;i+=3) {
			//한칸당 알파벳 보통 3개씩 있으므로 예외 case를 제외한 나머지는 통일해준다.
			for(int j=0;j<3;j++) {
				alpha[i+j]=num;
			}
			//4개씩 있는 칸은 한번더
			if(i==15 || i==22) alpha[(i++)+3]=num;
			num++;
		}
		
		alpha[25]=10;

		String str=sc.nextLine();
		
		for(int i=0;i<str.length();i++) {
			result+=alpha[str.charAt(i)-65];
		}
		System.out.println(result);
	}
}