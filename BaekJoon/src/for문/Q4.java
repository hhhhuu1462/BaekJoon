package for��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4 {
	/* ù �ٿ� �׽�Ʈ���̽��� ���� T�� �־�����. T�� �ִ� 1,000,000�̴�. 
	 ���� T�ٿ��� ���� �� ���� A�� B�� �־�����. A�� B�� 1 �̻�, 1,000 �����̴�.
	*/
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = bufferedReader.readLine();
		int n = Integer.parseInt(s);
		if(n > 1000000) {
			System.out.println("�Է°��� 1000000�� �Ѿ����ϴ�.");
			return;
		}
		for (int i = 0; i < n; i++) {
			String[] word = bufferedReader.readLine().split(" ");
			if (Integer.parseInt(word[0]) < 0 || Integer.parseInt(word[0]) > 1000
					|| Integer.parseInt(word[1]) < 0 || Integer.parseInt(word[1]) > 1000) {
				System.out.println("�������� ���ڴ� 0 ~ 1000 ������ �����Դϴ�");
				return;
			}
			bufferedWriter.write(Integer.parseInt(word[0]) + Integer.parseInt(word[1]) + "\n");
		}
		bufferedWriter.flush();
		bufferedWriter.close();	
		
	}
}
