package Chpater2;

import java.util.Scanner;

public class Problem9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �߽ɰ� ������ �Է�>>");
		double cX = scanner.nextDouble(), cY=scanner.nextDouble(), r=scanner.nextDouble();
		System.out.print("�� �Է�>>");
		double x =scanner.nextDouble(), y= scanner.nextDouble();
		
		double length = Math.sqrt(Math.pow(x-cX, 2) + Math.pow(y-cY,2));
		if(length < r)
			System.out.println("�� ("+x+","+y+")�� �� �ȿ� �ִ�.");
		else
			System.out.println("�� �ȿ� ����.");
		scanner.close();
	}
}
