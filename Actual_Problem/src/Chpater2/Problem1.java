package Chpater2;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int money = scanner.nextInt();
		System.out.println(money+"���� $" + (float)money/1100 + "�Դϴ�.");
		scanner.close();
	}
}
