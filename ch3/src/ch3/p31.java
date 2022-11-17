package ch3;

public class p31 {
	public static void main(String[] args) {
		Car31.showSum();
		Car31 car311;
		car311 = new Car31();
		car311.setCar31(1234,20.5);
		Car31.showSum();
		Car31 car312;
		car312 = new Car31();
		car312.setCar31(4567,30.5);
	}
}

class Car31{
	public static int sum=0;
	private int num;
	private double gas;
	public Car31() {
		num=0;
		gas=0.0;
		sum++;
		System.out.println("生產了車子");
	}
	public void setCar31(int n,double g){
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	public static void showSum() {
		System.out.println("車子總共有"+sum+"台");
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
