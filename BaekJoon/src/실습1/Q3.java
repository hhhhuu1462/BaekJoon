package �ǽ�1;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
	/* �� ���� A, B, C�� �־�����. �̶�, �� ��°�� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.  */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num[] = new int[3];
				
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}
		
		Arrays.sort(num);
	
		System.out.println(num[1]);
		
		scanner.close();
	}
}
