package Chpater2;

import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� 3�� �Է�>>");
		int[] array = new int[3];
		for(int i=0; i<3; i++)
			array[i] = scanner.nextInt();
		Arrays.sort(array);
		System.out.println("�߰� ���� " + array[1]);
		
		scanner.close();
	}
}
