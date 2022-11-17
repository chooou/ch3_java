package ch3;

public class p15 {
	public static void main(String[] args) {
		Key key1;
		key1 = new Key();
		int number=1234;
		double weight=20.5;
		key1.setNumWei(number,weight);
	}
}

class Key{
	int num;
	double weight;
	void setNumWei(int n, double w) {
		num =n;
		weight=w;
		System.out.println("將編號設為"+num+"，重量設為"+weight);
	}
	void show() {
		System.out.println("編號是"+num);
		System.out.println("重量為"+weight);
	}
}
