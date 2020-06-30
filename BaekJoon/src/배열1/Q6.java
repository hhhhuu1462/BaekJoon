package �迭1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q6 {
	/*
		"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�.
	 	������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.
		"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
		OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder(); // ���� �հ� �����ϱ� ���� ���
		int test_case = Integer.parseInt(br.readLine()); // �׽�Ʈ���̽� ����
		
		String arr[] = new String[test_case];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine(); // ox ���ڿ�
		}
		
		for (int i = 0; i < test_case; i++) {
			int cnt = 0; // ���� Ƚ��
			int sum = 0; //���� �ջ�
			
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'o') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			sb.append(sum).append('\n'); // ������ �������� sum ������
		}
		System.out.println(sb);
	}
}
