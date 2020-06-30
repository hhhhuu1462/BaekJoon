package �迭1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q5 {
	/*
		�����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. 
		�ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
		���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
		�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double num[] = new double[Integer.parseInt(br.readLine())];
				
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
		for (int i = 0; i < num.length; i++) {
			num[i] = Double.parseDouble(st.nextToken());
		}		
		
		double sum = 0;
		Arrays.sort(num);
		
		for (int i = 0; i < num.length; i++) {
			sum += ((num[i] / num[num.length-1]) * 100);
		}
		System.out.println(sum / num.length);
	}
}
