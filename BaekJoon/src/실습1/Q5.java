package 실습1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {
	/* 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
	 	5를 입력했을 경우
		*********
		 *******
		  *****
		   ***
		    *
		   ***
		  *****
		 *******
		*********
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		// 역삼각형
		for (int i = 0; i < N; i++) { // !~N
			// 공백
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// 별
			for (int k = 0; k < (2*N-1) - (2*i); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 삼각형
		for (int i = 0; i < N-1; i++) { // N+1 ~ 2N-1
			// 공백
			for (int j = 1; j < (N-1) - i; j++) {
				System.out.print(" ");
			}
			// 별
			for (int k = 0; k < 3 + 2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
