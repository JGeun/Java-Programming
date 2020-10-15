package Chpater2;

import java.util.Scanner;

public class Problem11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		int month = scanner.nextInt();
		printIfElse(month);
		printSwitch(month);
		
		scanner.close();
	}
	public static void printIfElse(int month) {
		if(month > 12 || month < 1)
			System.out.println("잘못입력");
		else if(month>=3 && month <=5)
			System.out.println("봄");
		else if(month>=6 && month<=8)
			System.out.println("여름");
		else if(month>=9 && month <=11)
			System.out.println("가을");
		else
			System.out.println("겨울");
	}
	public static void printSwitch(int month) {
		switch(month) {
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("잘못입력");
		}
	}
}
