package chpater3;

public class Problem9 {
	public static void main(String[] args) {
		int[][] array = new int[4][4];
		for(int i=0; i<16; i++) {
			array[i/4][i%4] = (int)(Math.random()*10+1);
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
