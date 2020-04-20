package string;

import java.util.Scanner;
import java.util.Stack;
//https://www.acmicpc.net/problem/4949
//4949 - 균형잡힌 세상

public class B_4949 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = "";
		char [][] ch = {{'(', ')'}
						,{'[', ']'}};
		Stack<Character> stack = new Stack<Character>();
		
		while (true) {
			str = sc.nextLine();
			if (str.equals("."))
				break;
			
			boolean flag = true;
			for (int i = 0; i < str.length(); i++) {
				char tmp = str.charAt(i);
				// ( [ 가 오면 stack에 넣기
				if(tmp == ch[0][0] || tmp == ch[1][0])
					stack.add(tmp);
				//닫힌 괄호가 올때 만약 마지막에 들어간 괄호가 해당 괄호와 쌍을 이루지 못하면 균형잡힌 문자열이 아니다
				else {
					for (int j = 0; j < 2; j++) {
						if(tmp == ch[j][1]) {
							if (stack.size() == 0 || stack.peek() != ch[j][0]) {
								flag = false;
								break;
							} else {
								stack.pop();
							}
						}
					}
				}
			}
			if (flag && stack.size() == 0)
				System.out.println("yes");
			else
				System.out.println("no");
			stack.clear();
		}
	}
	
	//try catch를 활용한 코드
	/*
	 * 스택인데 변수명을 q로 잘못잡음.
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = "";
		Stack<Character> q = new Stack<Character>();
		
		while (true) {
			str = sc.nextLine();
			if (str.equals("."))
				break;
			
			boolean flag = true;
			try {
				for (int i = 0; i < str.length(); i++) {
					char ch = str.charAt(i);
					if(ch == '(' || ch == '[')
						q.add(ch);
					if(ch == ')') {
						if (q.peek() != '(') {
							flag = false;
							break;
						} else {
							q.pop();
						}
					}
					
					if(ch == ']') {
						if (q.peek() != '[') {
							flag = false;
							break;
						} else {
							q.pop();
						}
					}
				}
				if (flag && q.size() == 0)
					System.out.println("yes");
				else
					System.out.println("no");
			} catch (Exception IndexOutOfBoundsException) {
				// TODO: handle exception
				System.out.println("no");
			}
			q.clear();
		}
	}
	*/
}