package for��;

import java.util.Scanner;

public class Q3 {
	/* n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		scanner.close();
	}
}
