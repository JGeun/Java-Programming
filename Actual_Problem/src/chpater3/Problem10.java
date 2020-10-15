package chpater3;

import java.util.Arrays;
import java.util.Scanner;

public class Problem10 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int[][] array = new int[4][4];
		
		for(int i=0; i<4; i++)
			for(int j=0; j<4; j++)
				array[i][j] = 0;
		
		for(int i=0; i<10; i++) {
			int x = (int)(Math.random()*4);
			int y = (int)(Math.random()*4);
			int num = (int)(Math.random()*10+1);
			array[y][x] = num;
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
