package Chpater2;

import java.util.Scanner;

public class Problem12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����>>");
		
		int num1 = scanner.nextInt();
		String ch = scanner.next();
		int num2 = scanner.nextInt();
		
		if(ch.equals("/") && num2 == 0)
			System.out.println("0���� ���� �� �����ϴ�.");
		else {
			System.out.println(num1+ch+num2+"�� ������� " + calcIFElse(num1, num2, ch));
		}
		
		scanner.close();
	}
	public static int calcIFElse(int num1, int num2, String ch) {
		if(ch.equals("+"))
			return num1 + num2;
		else if(ch.equals("+"))
			return num1 - num2;
		else if(ch.equals("*"))
			return num1 * num2;
		else 
			return num1 / num2;
	}
}
