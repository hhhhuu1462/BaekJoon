package for��;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q5 {
	/* �ڿ��� N�� �־����� ��, 1���� N���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */
	
	public static void main(String[] args) throws Exception {
//		Scanner scanner = new Scanner(System.in);
//		
//		int N = scanner.nextInt();
//		if (N > 100000) {
//			System.out.println("N�� 100000 ������ ���� �����մϴ�");
//		}
//		
//		for (int i = 1; i <= N; i++) {
//			System.out.println(i);
//		}
//		
//		scanner.close();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		for (int j = 1; j <= n; j++) {
			System.out.println(j);
		}
	}
}
