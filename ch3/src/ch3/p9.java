package ch3;

public class p9 {
	public static void main(String[] args) {
		Cat cat1;
		cat1 = new Cat();
		cat1.num=1234;
		cat1.weight = 20.5;
	}
}
class Cat {
	int num;
	double weight;
	void show(){
		System.out.println("編碼是"+this.num);
		System.out.println("體重是"+this.weight);
		}
}