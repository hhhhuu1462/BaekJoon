package �Լ�;

public class Q1 {
/*
	���� n���� �־����� ��, n���� ���� ���ϴ� �Լ��� �ۼ��Ͻÿ�.
	
	java: long sum(int[] a); (Ŭ���� �̸�: Test)	
		1. a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 (0 �� a[i] �� 1,000,000, 1 �� n �� 3,000,000)
		2. ���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��	
*/
	
	public long sum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
