package for문;

import java.util.Scanner;

public class Q8 {
	/* 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		int sum[] = new int[T];
		int A[] = new int[T];
		int B[] = new int[T];
		
		for (int i = 0; i < T; i++) {
			A[i] = scanner.nextInt();
			B[i] = scanner.nextInt();
			sum[i] = A[i]+B[i];
		}
		
		for (int i = 0; i < T; i++) {
			System.out.println("Case #" + (i+1) + ": " + A[i] + " + " + B[i] + " = " + (A[i]+B[i]));
		}
		
		scanner.close();
	}
}
