package if��;

import java.util.Scanner;

public class Q5 {
	/*
	ù° �ٿ� �� ���� H�� M�� �־�����. (0 �� H �� 23, 0 �� M �� 59) 
	�׸��� �̰��� ���� ����̰� ������ ���� �˶� �ð� H�� M���� �ǹ��Ѵ�.
	�Է� �ð��� 24�ð� ǥ���� ����Ѵ�. 24�ð� ǥ������ �Ϸ��� ������ 0:0(����)�̰�, 
	���� 23:59(������ ���� 1�� ��)�̴�. �ð��� ��Ÿ�� ��, ���ʿ��� 0�� ������� �ʴ´�.
	*/
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
		if (M < 45) {
			H--;
			M = 60-(45-M);
			if (H < 0) {
				H = 23;
			}
			System.out.println(H + "  " + M);
		} else {
			System.out.println(H + "  " + (M-45));
		}
		
		scanner.close();
	}
}
