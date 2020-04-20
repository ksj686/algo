import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = "";
		char [][] ch = {{'(', ')'}
						,{'[', ']'}};
		Stack<Character> q = new Stack<Character>();
		
		while (true) {
			str = sc.nextLine();
			if (str.equals("."))
				break;
			
			boolean flag = true;
			for (int i = 0; i < str.length(); i++) {
				char tmp = str.charAt(i);
				if(tmp == ch[0][0] || tmp == ch[1][0])
					q.add(tmp);
				else {
					for (int j = 0; j < 2; j++) {
						if(tmp == ch[j][1]) {
							if (q.size() == 0 || q.peek() != ch[j][0]) {
								flag = false;
								break;
							} else {
								q.pop();
							}
						}
					}
				}
			}
			if (flag && q.size() == 0)
				System.out.println("yes");
			else
				System.out.println("no");
			q.clear();
		}
	}
	
	//try catch를 활용한 코드
	/*
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