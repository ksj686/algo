package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/2941
//2941 - 크로아티아 알파벳

public class B_2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]array= {
				"c="
				,"c-"
				,"dz="
				,"d-"
				,"lj"
				,"nj"
				,"s="
				,"z="
				};

		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int result=0;
		
		//contains 메소드 사용해서 해당 문자열 포함하는지 확인한 후 replaceAll 메소드로 해당 문자열을 전부 1자리 문자로 변경
		for(int i=0;i<array.length;i++) {
			if(str.contains(array[i])) str=str.replaceAll(array[i], "1");
		}
		System.out.println(str.length());
	}
}