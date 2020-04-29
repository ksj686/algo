package dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//https://www.acmicpc.net/problem/1260
//1260 - DFS와 BFS

public class B_1260 {
	static boolean [][] mat;
	static int N;
	static boolean [] flag;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int M = sc.nextInt();
		int V = sc.nextInt();
		
		mat = new boolean[N+1][N+1];
		flag = new boolean[N+1];
		
		for (int i = 0; i < M; i++) {
			int src = sc.nextInt();
			int dst = sc.nextInt();
			mat[src][dst] = true;
			mat[dst][src] = true;
		}
		
		//DFS
		flag[V] = true;
		DFS(V);
		System.out.println();
		
		//BFS
		Queue<Integer> q = new LinkedList<Integer>();
		flag = new boolean[N+1];
		
		flag[V] = true;
		q.add(V);
		
		while (!q.isEmpty()) {
			int src = q.poll();
			System.out.print(src + " ");
			for (int i = 1; i <= N; i++) {
				if (mat[src][i] && !flag[i]) {
					flag[i] = true;
					q.add(i);
				}
			}
		}
	}
	
	static void DFS(int v) {
		System.out.print(v + " ");
		for (int i = 1; i <= N; i++) {
			if (mat[v][i] && !flag[i]) {
				flag[i] = true;
				DFS(i);
			}
		}
	}
}