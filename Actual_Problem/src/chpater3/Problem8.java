package chpater3;

import java.util.Scanner;

public class Problem8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int size = sc.nextInt();
		int[] array = new int[size];
		boolean[] check = new boolean[101];
		
		int count = 0;
		for(int i=0; i<size; i++) {
			int num;
			count+=1;
			do {
				num = (int)(Math.random()*100+1);
			}while(check[num]);
			check[num] = true;
			array[i] = num;
			System.out.print(num+" ");
			if(count == 10) {
				System.out.println();
				count = 0;
			}
				
		}
	}
}
