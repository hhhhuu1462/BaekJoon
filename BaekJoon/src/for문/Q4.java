package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4 {
	/* 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 
	 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
	*/
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = bufferedReader.readLine();
		int n = Integer.parseInt(s);
		if(n > 1000000) {
			System.out.println("입력값이 1000000이 넘었습니다.");
			return;
		}
		for (int i = 0; i < n; i++) {
			String[] word = bufferedReader.readLine().split(" ");
			if (Integer.parseInt(word[0]) < 0 || Integer.parseInt(word[0]) > 1000
					|| Integer.parseInt(word[1]) < 0 || Integer.parseInt(word[1]) > 1000) {
				System.out.println("더해지는 숫자는 0 ~ 1000 까지의 숫자입니다");
				return;
			}
			bufferedWriter.write(Integer.parseInt(word[0]) + Integer.parseInt(word[1]) + "\n");
		}
		bufferedWriter.flush();
		bufferedWriter.close();	
		
	}
}
