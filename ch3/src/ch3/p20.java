package ch3;

public class p20 {
	public static void main(String[] args) {
		Car20 car201;
		car201 = new Car20();
		car201.num=1234;
		car201.gas=-10;
		car201.show();
	}
}

class Car20{
	int num;
	double gas;
	void show() {
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}