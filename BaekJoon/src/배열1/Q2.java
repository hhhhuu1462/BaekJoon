package 배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {
	/* 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오. */
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num[] = new int[9];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		int index = 0;
		
		int count = 0;
		
		for (int value : num) {
			count++;
			if (value > max) {
				max = value;
				index = count;
			}
		}
		
		System.out.println(max);
		System.out.println(index); 
	}
}
