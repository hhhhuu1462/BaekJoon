package while문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1 {
	/* 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. */
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if (A==0 && B==0) {
				break;
			}
			
			sb.append((A+B)).append("\n");
		}
		System.out.println(sb);
	}
}
