package for��;

import java.util.Scanner;

public class Q5 {
	/* �ڿ��� N�� �־����� ��, 1���� N���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		if (N > 100000) {
			System.out.println("N�� 100000 ������ ���� �����մϴ�");
		}
		
		for (int i = 1; i <= N; i++) {
			System.out.println(i);
		}
		
		scanner.close();
	}
}
