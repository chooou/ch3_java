package ch3;

public class p11 {
	public static void main(String[] args) {
		Dog dog1;
		dog1 = new Dog();
		dog1.num=1234;
		dog1.weight=20.5;
		dog1.show();
		dog1.show();
	}
}
class Dog{
	int num;
	double weight;
	void show() {
		System.out.println("編號是"+num);
		System.out.println("體重是"+weight);
	}
}
