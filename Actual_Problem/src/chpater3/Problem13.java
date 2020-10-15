package chpater3;

public class Problem13 {
	public static void main(String[] args) {
		for(int i=1; i<=99; i++) {
			int count = 0;
			if((i/10) !=0 && (i/10)%3 ==0)
				count+=1;
			if((i%10) != 0 && (i%10)%3 == 0)
				count+=1;
			
			if(count == 2)
				System.out.println(i + " ¹Ú¼öÂ¦Â¦");
			else if(count == 1)
				System.out.println(i + " ¹Ú¼öÂ¦");
		}
	}
}
