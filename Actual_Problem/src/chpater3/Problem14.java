package chpater3;

import java.util.Scanner;

public class Problem14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	      String course[] = {"Java", "C++", "HTML", "컴퓨터구조",  "안드로이드"};
	      int score[] = {95, 88, 76, 62, 55};
	      
	      while(true) {
	         System.out.print("과목 이름>>");
	         String name = sc.next();
	         if(name.equals("그만"))
	            break;
	         boolean isGetValue = false;
	         for(int i=0; i<course.length; i++) {
	            if(name.equals(course[i])) {
	               System.out.println(name+"의 점수는 " + score[i]);
	               isGetValue = true;
	               break;
	            }
	         }
	         if(!isGetValue) 
	            System.out.println("없는 과목입니다.");
	      }
	}
}
