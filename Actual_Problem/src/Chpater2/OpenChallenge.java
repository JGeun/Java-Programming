package Chpater2;

import java.util.Scanner;

public class OpenChallenge {
	public static void main(String[] args) {
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		System.out.print("ö�� >> ");
		String boy = scanner.next();
		System.out.print("���� >> ");
		String girl= scanner.next();
		printWhoWin(boy, girl);
	}
	public static void printWhoWin(String boy, String girl) {
		if(boy.equals("����")) {
			if(girl.equals("����"))
				System.out.println("�����ϴ�.");
			else if(girl.equals("����"))
				System.out.println("ö���� �����ϴ�.");
			else
				System.out.println("ö���� �̰���ϴ�.");
		}
		else if(boy.equals("����")) {
			if(girl.equals("����"))
				System.out.println("ö���� �̰���ϴ�.");
			else if(girl.equals("����"))
				System.out.println("�����ϴ�.");
			else
				System.out.println("ö���� �����ϴ�.");
		}
		else {
			if(girl.equals("����"))
				System.out.println("ö���� �����ϴ�.");
			else if(girl.equals("����"))
				System.out.println("ö���� �̰���ϴ�.");
			else
				System.out.println("�����ϴ�.");
		}
	}
	
}
