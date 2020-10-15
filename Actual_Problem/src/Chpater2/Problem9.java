package Chpater2;

import java.util.Scanner;

public class Problem9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원의 중심과 반지름 입력>>");
		double cX = scanner.nextDouble(), cY=scanner.nextDouble(), r=scanner.nextDouble();
		System.out.print("점 입력>>");
		double x =scanner.nextDouble(), y= scanner.nextDouble();
		
		double length = Math.sqrt(Math.pow(x-cX, 2) + Math.pow(y-cY,2));
		if(length < r)
			System.out.println("점 ("+x+","+y+")는 원 안에 있다.");
		else
			System.out.println("원 안에 없다.");
		scanner.close();
	}
}
