package for��;

import java.util.Scanner;

public class Q1 {
	/* 
	N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
	*/
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(N + " * " + i + " = " + N*i);
		}
		
		scanner.close();
	}
}
