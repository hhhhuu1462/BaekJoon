package if��;

import java.util.Scanner;

public class Q1 {
	// �� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int A = scanner.nextInt();
		final int B = scanner.nextInt();

		System.out.println((A>B) ? ">" : (A<B) ? "<" : "==");

		scanner.close();
	}
}
