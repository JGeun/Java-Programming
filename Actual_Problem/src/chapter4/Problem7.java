package chapter4;

class Day{
	private String work;
	public void set(String word) {this.work = work;}
	public String get() {return work;}
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work +"입니다.");
	}
}

class MonthSchedule{
	private Day[] day;
	public MonthSchedule(int days){
		day = new Day[days];
	}
	public void input(int days) {
		
	}
}

public class Problem7 {
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		System.out.println(30);
	}
}
