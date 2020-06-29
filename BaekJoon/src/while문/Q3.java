package while��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q3 {
	/* N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. */
	
	public static void main(String[] args) throws Exception, Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		if (str.length() == 1) {
			str += "0";
		}
		
		String answer = str;
		int cnt = 0;
		
		while (true) {
			int tens = str.charAt(0)-48;
			int units = str.charAt(1)-48;
			int result = tens + units;
			
			if (result >= 10) {
				result %=10;
			}
			str = units + "" + result;
			cnt++;
			
			if (str.equals(answer)) {
				bw.write(cnt+"\n");
				bw.flush();
				break;
			}
		}
	}
}
