package if��;

import java.util.Scanner;

public class Q4 {
	/*
	��ǥ�� (12, 5)�� �� A�� x��ǥ�� y��ǥ�� ��� ����̹Ƿ� ��1��и鿡 ���Ѵ�.
	�� B�� x��ǥ�� �����̰� y��ǥ�� ����̹Ƿ� ��2��и鿡 ���Ѵ�.
	���� ��ǥ�� �Է¹޾� �� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
	��, x��ǥ�� y��ǥ�� ��� ����� ������� �����Ѵ�.
	*/
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		int x = scanner.nextInt();		
		int y = scanner.nextInt();
		
		if (x>0 && y>0) {
			System.out.println("1");
		} else if (x<0 && y>0) {
			System.out.println("2");
		} else if (x<0 && y<0) {
			System.out.println("3");
		} else if (x>0 && y<0) {
			System.out.println("4");
		}
		
		scanner.close();
	}
}
