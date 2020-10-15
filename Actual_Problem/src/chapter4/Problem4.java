package chapter4;

class Rectangle {
	int x, y, width, height; //사각형을 구성하는 점과 크기 정보 
	Rectangle(int x, int y, int width, int height){ //매개변수를 받아 필드를 초기화하는 생성자
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square() { //사각형의 넓이를 리턴
		return width * height;
	}
	
	public void show() { //사각형의 좌표와 넓이를 화면에 출력
		System.out.println("("+x+","+y+")에서 크기가 "+width +"x" +height+"인 사각형");
	}
	
	public boolean contains(Rectangle r) { //매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
		if((this.x < r.x && this.y < r.y) && (this.x+this.width > r.x+ r.width && this.y+this.height > r.y+r.height))
				return true;
		return false;
	}
}

public class Problem4{
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7); //x=2,y=2,width=8,height=7인 Rectangle객체 r 생성
		Rectangle s = new Rectangle(5, 5, 6, 6); //x=5,y=5,width=6,height=6인 Rectangle객체 s 생성
		Rectangle t = new Rectangle(1, 1, 10, 10); //x=1,y=1,width=10,height=10인 Rectangle객체 t 생성
		
		r.show(); //r의 좌표와 넓이 출력
		System.out.println("s의 면적은 " + s.square()); //s의 사각형 넓이 출력
		if(t.contains(r)) System.out.println("t는 r을 포함합니다."); //t가 r을 포함하고 있을 때 출력
		if(t.contains(s)) System.out.println("t는 s를 포함합니다."); //t가 s을 포함하고 있을 때 출력
	}
}
