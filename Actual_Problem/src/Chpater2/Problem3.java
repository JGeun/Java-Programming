package Chpater2;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = scanner.nextInt();
		
		int[] intUnit = {50000, 10000, 1000, 100, 50, 10, 1};
		String[] stringUnit = {"��������", "������", "õ����", "���", "���ʿ�", "�ʿ�", "�Ͽ�"};
		
		for(int i=0; i<intUnit.length; i++) {
			System.out.print(stringUnit[i] + " " + money/intUnit[i]);
			if(i<3)
				System.out.println("��");
			else
				System.out.println("��");
			money %= intUnit[i];
		}
		scanner.close();
	}
}
