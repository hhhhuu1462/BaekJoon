package for��;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11 {
	/* ���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer tokenizer1 = new StringTokenizer(reader.readLine());
		StringBuilder builder = new StringBuilder();
		
		int N = Integer.parseInt(tokenizer1.nextToken());
		int X = Integer.parseInt(tokenizer1.nextToken());
		
		StringTokenizer tokenizer2 = new StringTokenizer(reader.readLine());
		
		for(int i=0 ; i<N ; i++){
			int num = Integer.parseInt(tokenizer2.nextToken());
			if(num < X)
				builder.append(num).append(" ");
		}
		System.out.println(builder);
	}
}
