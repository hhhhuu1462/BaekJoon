package ½Ç½À1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q6 {
	/*
	 	2			3
	 *			*	*
	 *		  *
	 *			*	*
	 *		  *
	 *	*
	 *
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= 2*N; i++) {
			// È¦¼ö
			if (i%2 == 1) {
				for (int j = 1; j <= N; j++) {
					// È¦¼ö¹øÂ°
					if (j%2 == 1) {
						System.out.print("*");
					} /* Â¦¼ö¹øÂ° */ else {
						System.out.print(" ");
					}					
				}
			} /* Â¦¼ö */ else {
				for (int j = 1; j <= N; j++) {
					// È¦¼ö¹øÂ°
					if (j%2 == 1) {
						System.out.print(" ");
					} /* Â¦¼ö¹øÂ° */ else {
						System.out.print("*");
					}					
				}
			}
			System.out.println();
		}
	}
}
