package Chpater2;

import java.util.Scanner;

public class Problem10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		double cX1 = scanner.nextDouble(), cY1=scanner.nextDouble(), r1 = scanner.nextDouble();
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		double cX2 =scanner.nextDouble(), cY2= scanner.nextDouble(), r2 = scanner.nextDouble();
		
		double length = Math.sqrt(Math.pow(cX2-cX1, 2) + Math.pow(cY2-cY1,2));
		if(length < r1 + r2)
			System.out.println("�� ���� ���� ��ģ��.");
		else
			System.out.println("�� ���� ��ġ�� �ʴ´�.");
		scanner.close();
	}
}
