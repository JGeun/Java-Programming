package chpater3;

import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		int[] array= new int[10];
		for(int i=0; i<10; i++)
			array[i] = scanner.nextInt();
		
		System.out.print("3�� ����� ");
		for(int i=0; i<10; i++)
			if(array[i]%3 == 0)
				System.out.print(array[i] + " ");
	}
}
