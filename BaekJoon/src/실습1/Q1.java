package �ǽ�1;

import java.util.Scanner;

public class Q1 {
	/* ������ 40�� �̻��� �л����� �� ���� �״�� �ڽ��� ������ �ȴ�. 
	   ������, 40�� �̸��� �л����� �����н��� ��� ������ �����ϸ� 40���� �ް� �ȴ�. 
	   �����н��� �ź��� �� ���� ������, 40�� �̸��� �л����� �׻� 40���� �ް� �ȴ�.
	   �л� 5���� ������ �־����� ��, ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	*/

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score[] = new int [5];
		int sum = 0;
		int avg = 0;
		
		for (int i = 0; i < score.length; i++) {
			score[i] = scanner.nextInt();
			if (score[i] < 40) {
				score[i] = 40;
			}
			sum += score[i];
		}
		avg = sum / score.length;
		
		System.out.println(avg);
		
		scanner.close();
	}
}
