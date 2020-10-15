package chapter4;

class Rectangle {
	int x, y, width, height; //�簢���� �����ϴ� ���� ũ�� ���� 
	Rectangle(int x, int y, int width, int height){ //�Ű������� �޾� �ʵ带 �ʱ�ȭ�ϴ� ������
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square() { //�簢���� ���̸� ����
		return width * height;
	}
	
	public void show() { //�簢���� ��ǥ�� ���̸� ȭ�鿡 ���
		System.out.println("("+x+","+y+")���� ũ�Ⱑ "+width +"x" +height+"�� �簢��");
	}
	
	public boolean contains(Rectangle r) { //�Ű������� ���� r�� �� �簢�� �ȿ� ������ true ����
		if((this.x < r.x && this.y < r.y) && (this.x+this.width > r.x+ r.width && this.y+this.height > r.y+r.height))
				return true;
		return false;
	}
}

public class Problem4{
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7); //x=2,y=2,width=8,height=7�� Rectangle��ü r ����
		Rectangle s = new Rectangle(5, 5, 6, 6); //x=5,y=5,width=6,height=6�� Rectangle��ü s ����
		Rectangle t = new Rectangle(1, 1, 10, 10); //x=1,y=1,width=10,height=10�� Rectangle��ü t ����
		
		r.show(); //r�� ��ǥ�� ���� ���
		System.out.println("s�� ������ " + s.square()); //s�� �簢�� ���� ���
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�."); //t�� r�� �����ϰ� ���� �� ���
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�."); //t�� s�� �����ϰ� ���� �� ���
	}
}
