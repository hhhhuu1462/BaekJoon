package for��;

import java.util.Scanner;

public class Q6 {
	/* �ڿ��� N�� �־����� ��, N���� 1���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for (int i = N; i > 0; --i) {
			System.out.println(i);
		}
		
		scanner.close();
	}
}
