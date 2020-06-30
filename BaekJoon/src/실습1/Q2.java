package 실습1;

import java.util.Scanner;

public class Q2 {
	/*
	세트로 구매하면, 가격의 합계에서 50원을 뺀 가격이 세트 메뉴의 가격이 된다.
	햄버거는 총 3종류 상덕버거, 중덕버거, 하덕버거가 있고, 음료는 콜라와 사이다 두 종류가 있다.
	햄버거와 음료의 가격이 주어졌을 때, 가장 싼 세트 메뉴의 가격을 출력하는 프로그램을 작성하시오.
	
	입력은 총 다섯 줄이다. 첫째 줄에는 상덕버거, 둘째 줄에는 중덕버거, 셋째 줄에는 하덕버거의 가격이 주어진다. 
	넷째 줄에는 콜라의 가격, 다섯째 줄에는 사이다의 가격이 주어진다. 모든 가격은 100원 이상, 2000원 이하이다.
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
