package for��;

import java.util.Scanner;

public class Q7 {
	/* �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */
	
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
