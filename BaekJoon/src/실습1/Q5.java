package �ǽ�1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {
	/* ù° �ٺ��� 2��N-1��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
	 	5�� �Է����� ���
		*********
		 *******
		  *****
		   ***
		    *
		   ***
		  *****
		 *******
		*********
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		// ���ﰢ��
		for (int i = 0; i < N; i++) { // !~N
			// ����
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// ��
			for (int k = 0; k < (2*N-1) - (2*i); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// �ﰢ��
		for (int i = 0; i < N-1; i++) { // N+1 ~ 2N-1
			// ����
			for (int j = 1; j < (N-1) - i; j++) {
				System.out.print(" ");
			}
			// ��
			for (int k = 0; k < 3 + 2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
