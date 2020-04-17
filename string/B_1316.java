package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/1316
//1316 - 그룹 단어 체커

public class B_1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int result=0;
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			String str=sc.next();
			boolean[] flag=new boolean[26];
			boolean isGroup=true;
			for(int j=0;j<str.length()-1;j++) {
				//현재 알파벳이 다음 자리의 알파벳과 다를 경우 현재의 알파벳 체크
				//만약 이전에 체크한 이력이 있으면 그룹단어가 아니다
				if(str.charAt(j)!=str.charAt(j+1)) {
					if(!flag[str.charAt(j)-97]){
						flag[str.charAt(j)-97]=true;
					}else {
						isGroup=false;
						break;
					}
				}
			}
			//마지막 알파벳 체크
			if(flag[str.charAt(str.length()-1)-97]) isGroup=false;
			
			if(isGroup) result++;
		}
		System.out.println(result);
	}
}