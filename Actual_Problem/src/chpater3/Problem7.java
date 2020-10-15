package chpater3;

public class Problem7 {
	public static void main(String[] args) {
		int[] array = new int[10];
		
		int sum = 0;
		System.out.print("·£´ýÇÑ Á¤¼öµé : ");
		for(int i=0; i<10; i++) {
			int num = (int)(Math.random()*10+1);
			System.out.print(num + " ");
			array[i] = num;
			sum += num;
		}
		System.out.println("\nÆò±ÕÀº " + (double)sum/10);
	}
}
