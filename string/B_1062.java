//bit연산으로 체크하는 방법
package string;

import java.util.ArrayList;
import java.util.Scanner;
//https://www.acmicpc.net/problem/1062
//1062 - 가르침

public class B_1062 {
	static int N,K;
	static int []word;
	static int[][] dp;
	static int def;
	static int goal;
	static int result;
	static int all;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		K=sc.nextInt()-5;

		def=(1<<('a'-97))+(1<<('c'-97))+(1<<('i'-97))+(1<<('n'-97))+(1<<('t'-97));
		//a,c,i,n,t
		word=new int[N];

		for(int i=0;i<N;i++){
			String tmp=sc.next();

			if(tmp.length()>8){
				for(int j=4;j<tmp.length()-4;j++){
					int tmp1=tmp.charAt(j)-97;
					if((def & (1<<tmp1))==0){
						word[i]=word[i]|(1<<tmp1);
						
						if((goal & (1<<tmp1))==0){
							all++;
							goal=goal|1<<tmp1;
						}
					}
				}
			}
			goal=(goal|(word[i]));
		}

		sc.close();
		/*int a='a';	//-97
		System.out.println(a);*/

		if(K<0){
			System.out.println(0);
			return;
		}

		if(K==0){
			for(int i=0;i<N;i++){
				if(word[i]==0)
					result++;
			}
			System.out.println(result);
			return;
		}

		if(K>=all){
			System.out.println(N);
			return;
		}

		//System.out.println(def);
		//System.out.println(word[1]);

		DFS(0,0,1);

		System.out.println(result);
	}

	static void DFS(int kCnt, int mask,int maxBit){
		if(kCnt==K){
			//System.out.println(mask);
			int cnt=0;
			for(int i=0;i<N;i++){
				if((mask & word[i])==word[i])
					cnt++;
			}
			if(result<cnt) result=cnt;
			return;
		}

		if(result==N) return;

		for(int i=maxBit;i<26;i++){
			if((goal & 1<<i)!=0){
				DFS(kCnt+1, (mask | (1<<i)),i+1);
			}
		}
	}
	
	//시간초과
	/*
	//전체 단어에서 사용된 알파벳 체크 
	static ArrayList<Integer> checkAll = new ArrayList<Integer>();
	//실제 가르칠 알파벳 체크
	static boolean [] checked = new boolean[26];
	static int K;
	static int N;
	static int result = 0;
	static int [] alphaCnt;
	static boolean [][] checkStr;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		StringBuffer [] str = new StringBuffer[N];
		
		for (int i = 0; i < N; i++) {
			StringBuffer tmp = new StringBuffer();
			tmp.append(sc.next());
			tmp.delete(tmp.length()-4, tmp.length());
			tmp.delete(0, 4);
			str[i] = tmp;
		}
		
		//각 단어에서 사용된 알파벳 개수
		alphaCnt = new int[N];
		//각 단어에서 사용된 알파벳 체크
		checkStr = new boolean[N][26];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				checkAll.add(str[i].charAt(j)-'a');
				checkStr[i][str[i].charAt(j)-'a'] = true;
				alphaCnt[i]++;
			}
		}
		BruteForce(0,0);
		System.out.println(result);
	}
	
	static void BruteForce(int cnt, int index) {
		if (cnt == K) {
			int count = 0;
			for (int i = 0; i < N; i++) {
				int alpha = 0;
				for (int j = 0; j < checkAll.size(); j++) {
					if (checked[checkAll.get(j)] && checkStr[i][checkAll.get(j)])
						alpha++;
				}
				if (alpha == alphaCnt[i]) count++;
			}
			if (count > result) result = count;
			return;
		}
		if (index == checkAll.size()-1) return;
		
		for (int i = index; i < checkAll.size(); i++) {
			if (!checked[checkAll.get(i)]) {
				checked[checkAll.get(i)] = true;
				BruteForce(cnt+1, index+1);
			}
			checked[checkAll.get(i)] = false;
		}
	}
	*/
}