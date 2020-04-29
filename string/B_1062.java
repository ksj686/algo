//bit연산으로 체크하는 방법
package string;

import java.util.Scanner;
//https://www.acmicpc.net/problem/1062
//1062 - 가르침

public class B_1062 {
	static int result = 0;
	static int N;
	static int K;
	static int [] word;
	static int allWord;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		String [] str = new String[N];
		
		for (int i = 0; i < N; i++) {
			str[i] = sc.next();
		}
		
		if(K < 5) {
			System.out.println("0");
			return;
		}
		
		//default : a,c,i,n,t
		int def = 1<<('a'-'a') | 1<<('c'-'a') | 1<<('i'-'a') | 1<<('n'-'a') | 1<<('t'-'a');
		word = new int[N];
		allWord = 0;
		int allCnt = 5;
		
		//a,c,i,n,t 를 제외한 나머지 알파벳을 allWord, word 배열에 저장
		for (int i = 0; i < N; i++) {
			for (int j = 4; j < str[i].length()-4; j++) {
				int tmp = 1<<(str[i].charAt(j)-'a');
				if ((def & tmp) == 0) {
					word[i] = word[i] | tmp;
				
					//여기 조건 안걸면 에러남
					if ((allWord & tmp)==0){
						allCnt++;							
					}
				}
			}
			allWord = allWord | word[i];
		}
		
		if (K == 5){
			for (int i = 0; i < N; i++){
				if (word[i] == 0)
					result++;
			}
			System.out.println(result);
			return;
		}
		
		//이부분을 주석처리하면 오답. 밑의 DFS 첫문장 if (kCnt == K-5) 에서 안걸리기 때문
		if (K >= allCnt){
			System.out.println(N);
			return;
		}
		
		DFS(0,0,0);
		
		System.out.println(result);
	}
	
	static void DFS(int kCnt, int mask, int bIndex) {
		if (kCnt == K-5) {	//default 알파벳을 제외한 개수
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				if((word[i] & mask) == word[i]) {
					cnt++;
				}
			}
			if (result < cnt) result = cnt;
			return;
		}
		
		if (result == N) return;
		
		for (int i = bIndex+1; i < 26; i++) {
			if ((allWord & (1<<i)) != 0) {
				DFS(kCnt+1, (mask | (1<<i)), i);
			}
		}
	}
}