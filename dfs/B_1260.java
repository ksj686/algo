package dfs;

import java.util.Scanner;
//https://www.acmicpc.net/problem/1260
//1260 - DFS와 BFS

public class B_1260 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int V = sc.nextInt();
		
		boolean [][] mat = new boolean[N][N];
		
		for (int i = 0; i < M; i++) {
			mat[sc.nextInt()][sc.nextInt()] = true;
		}
		
		
	}
}