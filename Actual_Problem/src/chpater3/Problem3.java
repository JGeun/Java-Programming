package chpater3;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		int n = scanner.nextInt();
		for(int i=n; i>=1; i--) {
			for(int j=0; j<i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
