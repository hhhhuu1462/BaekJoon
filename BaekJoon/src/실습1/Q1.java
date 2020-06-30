package 실습1;

import java.util.Scanner;

public class Q1 {
	/* 점수가 40점 이상인 학생들은 그 점수 그대로 자신의 성적이 된다. 
	   하지만, 40점 미만인 학생들은 보충학습을 듣는 조건을 수락하면 40점을 받게 된다. 
	   보충학습은 거부할 수 없기 때문에, 40점 미만인 학생들은 항상 40점을 받게 된다.
	   학생 5명의 점수가 주어졌을 때, 평균 점수를 구하는 프로그램을 작성하시오.
	*/

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score[] = new int [5];
		int sum = 0;
		int avg = 0;
		
		for (int i = 0; i < score.length; i++) {
			score[i] = scanner.nextInt();
			if (score[i] < 40) {
				score[i] = 40;
			}
			sum += score[i];
		}
		avg = sum / score.length;
		
		System.out.println(avg);
		
		scanner.close();
	}
}
