package Chpater2;

import java.util.Scanner;

public class Problem6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1~99 ������ ������ �Է��Ͻÿ�>>");
		int n = scanner.nextInt();
		int count = 0;
		if(n/10 != 0 && (n/10)%3 == 0)
			count+=1;
		if((n%10) != 0 && (n%10)%3 == 0)
			count +=1;
		if(count == 2)
			System.out.println("�ڼ�¦¦");
		else if(count == 1)
			System.out.println("�ڼ�¦");
		scanner.close();
	}
}
