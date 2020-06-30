package 배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7 {
	/*  대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다. 
		첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
		둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
		이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		int test_case = Integer.parseInt(br.readLine()); // 테스트케이스 개수
		
		int num[];
		StringTokenizer st;
		
		for (int i = 0; i < test_case; i++) {
			st = new StringTokenizer(br.readLine(), " "); // 공백으로 구분
			
			int N = Integer.parseInt(st.nextToken()); // 학생 수
			num = new int[N]; // 학생 수 배열 지정
			
			double sum = 0;
			
			for (int j = 0; j < N; j++) {
				int val = Integer.parseInt(st.nextToken()); // 성적
				num[j] = val; 
				sum += val; // 성적 합산
			}
			
			double mean = (sum / N); // 평균
			double count = 0;
			
			for (int j = 0; j < N; j++) {
				if (num[j] > mean) { // 성적이 평균 보다 높으면 카운트 증가
					count++;
				}
			}	
			System.out.printf("%.3f%%\n", (count/N)*100);
		}		
	}
}
