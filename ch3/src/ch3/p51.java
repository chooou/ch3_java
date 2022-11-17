package ch3;

public class p51 {
	public static void main(String[] args) {
		Car51[] car511;
		car511 = new Car51[3];
		for(int i=0;i<car511.length;i++) {
			car511[i] = new Car51();
		}
		car511[0].setCar51(1234,20.5);
		car511[1].setCar51(2345,30.5);
		car511[2].setCar51(3456,40.5);
		for(int i=0;i<car511.length;i++) {
			car511[i].show();
		}
	}
}

class Car51{
	int num;
	double gas;
	public Car51() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public void setCar51(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}