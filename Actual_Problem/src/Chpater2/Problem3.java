package Chpater2;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money = scanner.nextInt();
		
		int[] intUnit = {50000, 10000, 1000, 100, 50, 10, 1};
		String[] stringUnit = {"오만원권", "만원권", "천원권", "백원", "오십원", "십원", "일원"};
		
		for(int i=0; i<intUnit.length; i++) {
			System.out.print(stringUnit[i] + " " + money/intUnit[i]);
			if(i<3)
				System.out.println("매");
			else
				System.out.println("개");
			money %= intUnit[i];
		}
		scanner.close();
	}
}
