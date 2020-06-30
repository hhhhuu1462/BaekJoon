package �迭1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7 {
	/*  ���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�. 
		ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
		��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, 
		�̾ N���� ������ �־�����. ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		int test_case = Integer.parseInt(br.readLine()); // �׽�Ʈ���̽� ����
		
		int num[];
		StringTokenizer st;
		
		for (int i = 0; i < test_case; i++) {
			st = new StringTokenizer(br.readLine(), " "); // �������� ����
			
			int N = Integer.parseInt(st.nextToken()); // �л� ��
			num = new int[N]; // �л� �� �迭 ����
			
			double sum = 0;
			
			for (int j = 0; j < N; j++) {
				int val = Integer.parseInt(st.nextToken()); // ����
				num[j] = val; 
				sum += val; // ���� �ջ�
			}
			
			double mean = (sum / N); // ���
			double count = 0;
			
			for (int j = 0; j < N; j++) {
				if (num[j] > mean) { // ������ ��� ���� ������ ī��Ʈ ����
					count++;
				}
			}	
			System.out.printf("%.3f%%\n", (count/N)*100);
		}		
	}
}
