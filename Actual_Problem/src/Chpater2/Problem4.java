package Chpater2;

import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 3개 입력>>");
		int[] array = new int[3];
		for(int i=0; i<3; i++)
			array[i] = scanner.nextInt();
		Arrays.sort(array);
		System.out.println("중간 값은 " + array[1]);
		
		scanner.close();
	}
}
