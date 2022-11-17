package ch3;

public class p17 {
	public static void main(String[] args) {
		Car17 car171;
		car171 = new Car17();
		car171.setNumGas(1234,20.5);
		int number = car171.getNum();
		double gasoline=car171.getGas();
		System.out.println("調查樣品時得知");
		System.out.println("車號是"+number+"，汽油量是"+gasoline);
	}
}

class Car17{
	int num;
	double gas;
	int getNum() {
		System.out.println("調查車號");
		return num;
	}
	double getGas() {
		System.out.println("調查汽油量");
		return gas;
	}
	void setNumGas(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
}
