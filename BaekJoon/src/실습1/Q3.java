package 실습1;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
	/* 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.  */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num[] = new int[3];
				
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}
		
		Arrays.sort(num);
	
		System.out.println(num[1]);
		
		scanner.close();
	}
}
