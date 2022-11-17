package ch3;

public class p26 {
	public static void main(String[] args) {
		Car26 car261;
		car261 = new Car26();
		car261.show();
	}
}

class Car26{
	private int num;
	private double gas;
	public Car26() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
