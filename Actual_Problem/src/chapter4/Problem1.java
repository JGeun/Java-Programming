package chapter4;

class TV{
	String brand;
	private int productionYear;
	private int inch;
	
	public TV(String brand, int productionYear, int inch) {
		this.brand = brand;
		this.productionYear = productionYear;
		this.inch = inch;
	}
	public void show() {
		System.out.println(brand + "���� ���� "+ productionYear+"���� " + inch+"��ġ TV");
	}
}

public class Problem1 {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}
