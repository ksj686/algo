package string;

import java.util.Scanner;
import java.util.Stack;
//https://www.acmicpc.net/problem/3986
//3986 - 좋은 단어
//마지막에 stack이 비어있지않으면 좋은 단어가 아니라고 생각하면 된다.
//https://mygumi.tistory.com/99

public class B_3986 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int N = sc.nextInt();
		String [] str = new String[N];
		for (int i = 0; i < N; i++) {
			str[i] = sc.next();
		}
		
		for (int i = 0; i < N; i++) {
			Stack <Character> s = new Stack<Character>();
			for(int j = 0; j < str[i].length(); j++) {
				if (s.isEmpty()) s.push(str[i].charAt(j));
				else if(s.peek() == str[i].charAt(j)) s.pop();
				else s.push(str[i].charAt(j));
			}
			if (s.isEmpty()) result++;
		}
		
		System.out.println(result);
	}
}