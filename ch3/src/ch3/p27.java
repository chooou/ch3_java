package ch3;

public class p27 {
	public static void main(String[] args) {
		Car27 car271;
		car271 = new Car27();
		car271.show();
		
		Car27 car272;
		car272 = new Car27(1234,25.0);
		car272.show();
	}
}

class Car27{
	private int num;
	private double gas;
	public Car27() {
		num=0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public Car27(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
