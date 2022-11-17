package ch3;

public class p7 {
	public static void main(String[] args) {
		Vehicle vehicle1;
		vehicle1 = new Vehicle();
		vehicle1.num = 1234;
		vehicle1.gas=20.5;
		
		Vehicle vehicle2;
		vehicle2 = new Vehicle();
		vehicle2.num =2345;
		vehicle2.gas = 30.5;
		
		System.out.println("vehicle1車號是"+vehicle1.num);
		System.out.println("vehicle1汽油量是"+vehicle1.gas);
		
		System.out.println("vehicle1車號是"+vehicle2.num);
		System.out.println("vehicle1汽油量是"+vehicle2.gas);		
	}
}

class Vehicle{
	int num;
	double gas;
}