package if문;

import java.util.Scanner;

public class Q1 {
	// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int A = scanner.nextInt();
		final int B = scanner.nextInt();

		System.out.println((A>B) ? ">" : (A<B) ? "<" : "==");

		scanner.close();
	}
}
