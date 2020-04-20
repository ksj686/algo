package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
//https://www.acmicpc.net/problem/1764
//1764 - 듣보잡

public class B_1764 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		String [] str = new String[N+M];
		ArrayList<String> strResult=new ArrayList<String>();
		
		//듣도 못한, 보도 못한 명단 배열 하나에 받기(이름은 중복되지 않는다고 가정)
		for (int i = 0; i < N + M; i++) {
			str[i] = sc.next();
		}
		
		//배열 정렬
		Arrays.sort(str);
		
		//배열 순서대로 비교. 중복되는 이름이 있는 경우 index 에 1 더해준 후 비교 계속
		for (int i = 0; i < N + M - 1; i++) {
			if (str[i].equals(str[i+1])) {
				strResult.add(str[i]);
				i++;
			}
		}
		
		System.out.println(strResult.size());
		for (int i = 0; i < strResult.size(); i++) {
			System.out.println(strResult.get(i));
		}
	}
	//시간초과
	/*
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		String [] strN = new String[N];
		String [] strM = new String[M];
		
		for (int i = 0; i < N; i++) {
			strN[i] = sc.next();
		}
		
		for (int i = 0; i < M; i++) {
			strM[i] = sc.next();
		}
		
		String [] strResult;
		if (N > M)
			strResult = new String[N];
		else
			strResult = new String[M];
		
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (strN[i].equals(strM[j]))
					strResult[cnt++] = strN[i];
			}
		}
		
		for (int i = cnt; i < strResult.length; i++) {
			strResult[i] = "";
		}
		
		System.out.println(cnt);
		Arrays.sort(strResult);
		for (int i = strResult.length - cnt; i < strResult.length; i++) {
			if(!strResult[i].equals(""))
				System.out.println(strResult[i]);
		}
	}
	*/
}