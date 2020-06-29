package for문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11 {
	/* 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오. */
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer tokenizer1 = new StringTokenizer(reader.readLine());
		StringBuilder builder = new StringBuilder();
		
		int N = Integer.parseInt(tokenizer1.nextToken());
		int X = Integer.parseInt(tokenizer1.nextToken());
		
		StringTokenizer tokenizer2 = new StringTokenizer(reader.readLine());
		
		for(int i=0 ; i<N ; i++){
			int num = Integer.parseInt(tokenizer2.nextToken());
			if(num < X)
				builder.append(num).append(" ");
		}
		System.out.println(builder);
	}
}
