package 배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1 {
	/* N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오. */

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int index = 0;
		int num[] = new int[N];
		
		while (st.hasMoreElements()) {
			num[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		
		Arrays.sort(num);
		
		System.out.println(num[0] + " " + num[N-1]);
	}
}
