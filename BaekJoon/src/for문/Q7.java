package for문;

import java.util.Scanner;

public class Q7 {
	/* 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		int answer[] = new int[T];
		
		for (int i = 0; i < T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			answer[i] = A+B;
		}
		
		for (int i = 0; i < T; i++) {
			System.out.println("Case #" + (i+1) + ": " + answer[i]);
		}
		
		scanner.close();
	}
}
