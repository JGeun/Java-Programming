package Chpater2;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� 3���� �Է��Ͻÿ�>>");
		int[] triangle = new int[3];
		for(int i=0; i<3; i++)
			triangle[i] = scanner.nextInt();
		Arrays.sort(triangle);
		
		if(triangle[0] + triangle[1] > triangle[2])
			System.out.println("�ﰢ���� �˴ϴ�.");
		else
			System.out.println("�ȵ˴ϴ�.");
		scanner.close();
	}
}
