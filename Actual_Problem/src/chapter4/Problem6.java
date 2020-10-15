package chapter4;

import java.util.Scanner;

public class Problem6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c[] = new Circle[3];
		int maxIndex= 0;
		for(int i=0; i<3; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x, y, radius);
			if(c[i].getRadius() > c[maxIndex].getRadius())
				maxIndex = i;
		}
		System.out.print("가장 면적인 큰 원은 ");
		c[maxIndex].show();

		scanner.close();
	}
}
