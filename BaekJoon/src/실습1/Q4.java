package �ǽ�1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {
	/* ù° �ٺ��� 2��N-1��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
		3 �Է½�
		*
		**
		***
		**
		*
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());		
		
		for (int i = 1; i <=  N; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = N-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
