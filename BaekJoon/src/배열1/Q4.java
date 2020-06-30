package �迭1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {
	/*
		�� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. 
		���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
		�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. 
		�� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num[] = new int[10]; // �Է¹��� ���� 10��

		int count = 0; // ���� �ٸ� �������� ����
		int counts[] = new int[42]; // �Է��� ���� ������ �� ����� ������ 0~41
		
		for (int i = 0; i < num.length; i++) { // ���� 10�� �Է¹ޱ�
			num[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < num.length; i++) { // ������ ���ؼ� ���� ���� �������� ������ ���� ����
			counts[num[i]%42]++;
		}
		
		for (int i = 0; i < counts.length; i++) { // ������ ���� ���� �ٸ� �������� ���� ī��Ʈ
			if (counts[i] != 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}

