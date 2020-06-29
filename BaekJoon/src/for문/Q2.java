package for문;

import java.util.Scanner;

public class Q2 {
	/* 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		int arr[] = new int[T];
		
		for (int i = 0; i < T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			arr[i] = A + B;
		}
		
		for (int answer : arr) {
			System.out.println(answer);
		}
		
		scanner.close();
	}
}
