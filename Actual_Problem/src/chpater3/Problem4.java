package chpater3;

import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		String word = scanner.next();
		
		for(char i = word.charAt(0); i>='a'; i--) {
			for(char j = 'a'; j<=i; j++)
				System.out.print(j);
			System.out.println();
		}
	}
}
