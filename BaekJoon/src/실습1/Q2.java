package �ǽ�1;

import java.util.Scanner;

public class Q2 {
	/*
	��Ʈ�� �����ϸ�, ������ �հ迡�� 50���� �� ������ ��Ʈ �޴��� ������ �ȴ�.
	�ܹ��Ŵ� �� 3���� �������, �ߴ�����, �ϴ����Ű� �ְ�, ����� �ݶ�� ���̴� �� ������ �ִ�.
	�ܹ��ſ� ������ ������ �־����� ��, ���� �� ��Ʈ �޴��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է��� �� �ټ� ���̴�. ù° �ٿ��� �������, ��° �ٿ��� �ߴ�����, ��° �ٿ��� �ϴ������� ������ �־�����. 
	��° �ٿ��� �ݶ��� ����, �ټ�° �ٿ��� ���̴��� ������ �־�����. ��� ������ 100�� �̻�, 2000�� �����̴�.
	*/
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int burger = 9999;
		int drink = 9999;
		
		for (int i = 0; i < 3; i++) {
			int burgerPrice = scanner.nextInt();
			if (burgerPrice < burger) {
				burger = burgerPrice;
			}			
		}
		
		for (int i = 0; i < 2; i++) {
			int drinkPrice = scanner.nextInt();
			if (drinkPrice < drink) {
				drink = drinkPrice;
			}
		}
		
		System.out.println(burger + drink - 50);
		
		scanner.close();
	}
}
