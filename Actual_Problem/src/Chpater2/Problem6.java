package Chpater2;

import java.util.Scanner;

public class Problem6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1~99 사이의 정수를 입력하시오>>");
		int n = scanner.nextInt();
		int count = 0;
		if(n/10 != 0 && (n/10)%3 == 0)
			count+=1;
		if((n%10) != 0 && (n%10)%3 == 0)
			count +=1;
		if(count == 2)
			System.out.println("박수짝짝");
		else if(count == 1)
			System.out.println("박수짝");
		scanner.close();
	}
}
