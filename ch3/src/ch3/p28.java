package ch3;

public class p28 {
	public static void main(String[] args) {
		Car28 car281;
		car281 = new Car28();
		car281.show();
		Car28 car282;
		car282= new Car28(1234,25.0);
		car282.show();
	}
}

class Car28{
	private int num;
	private double gas;
	public Car28() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public Car28(int n,double g) {
		this();
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
