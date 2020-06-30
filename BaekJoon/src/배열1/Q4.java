package 배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {
	/*
		두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 
		예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
		수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
		그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num[] = new int[10]; // 입력받을 숫자 10개

		int count = 0; // 서로 다른 나머지의 개수
		int counts[] = new int[42]; // 입력한 값을 나눴을 때 생기는 나머지 0~41
		
		for (int i = 0; i < num.length; i++) { // 정수 10개 입력받기
			num[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < num.length; i++) { // 나머지 구해서 같은 수의 나머지가 나오면 개수 증가
			counts[num[i]%42]++;
		}
		
		for (int i = 0; i < counts.length; i++) { // 위에서 구한 서로 다른 나머지의 개수 카운트
			if (counts[i] != 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}

