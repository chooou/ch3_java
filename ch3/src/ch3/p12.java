package ch3;

public class p12 {
	public static void main(String[] args) {
		Puppy puppy1;
		puppy1 = new Puppy();
		puppy1.num=1234;
		puppy1.weight=20.5;
		puppy1.showPuppy();
	}
}
class Puppy{
	int num;
	double weight;
	void show() {
		System.out.println("編號是"+this.num);
		System.out.println("體重是"+this.weight);
	}
	void showPuppy() {
		System.out.println("開始顯示小狗的資料");
		this.show();
	}
}