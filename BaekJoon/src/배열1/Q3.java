package �迭1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {
	/* �� ���� �ڿ��� A, B, C�� �־��� �� 
	   A��B��C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
	   ���� ��� A = 150, B = 266, C = 427 �̶�� 
       A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
	   ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num[] = new int[3];
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		int A = num[0];
		int B = num[1];
		int C = num[2];
		
		int abs = A * B * C;
		String str = String.valueOf(abs); // �� ���ڸ� ���� �� ���ڿ��� ����ȯ
		
		int arr[] = new int[10]; // 0~9���� ���� ������ ��� ���� �迭 ����
		
		for (int i = 0; i < str.length(); i++) { // ���ڿ��� ��ȯ�� ������ ���� ��ŭ for�� ����
			arr[(str.charAt(i) - 48)]++; // �����ڵ��̱� ������ -48
		}
		
		for (int v : arr) {
			System.out.println(v);
		}
		
	}
}
