package for문;

import java.util.Scanner;

public class Q5 {
	/* 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오. */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		if (N > 100000) {
			System.out.println("N은 100000 이하의 수만 가능합니다");
		}
		
		for (int i = 1; i <= N; i++) {
			System.out.println(i);
		}
		
		scanner.close();
	}
}
