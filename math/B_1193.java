package math;

//https://www.acmicpc.net/problem/1193
//1193 - �м�ã�� 
//1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 ->

import java.util.Scanner;

public class B_1193 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		//1,2,4,7,11,16,22,
		int n = 1;
		int plus = 1;
		while (X >= n) {
			if(X >= n + plus) {
				n = n + plus;
				plus++;
			} else {
				break;
			}
		}
		plus--;
		
		//ó���� ������׸� ������. plus�� �ѹ� �� �������� ����
		if (plus%2 == 1) {
			System.out.println((1+X-n)+"/"+(plus+1-X+n));
		} else {
			System.out.println((plus+1-X+n)+"/"+(1+X-n));
		}
	}
}
