package for��;

import java.util.Scanner;

public class Q2 {
	/* �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */
	
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
