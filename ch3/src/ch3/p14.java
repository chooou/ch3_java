package ch3;

public class p14 {
	public static void main (String[] args) {
		Box box1;
		box1 = new Box();
		box1.setNum(1234);
		box1.setSize(20.5);
	}
}
class Box{
	int num;
	double size;
	void setNum(int n) {
		num=n;
		System.out.println("將編號設為"+num);
	}
	void setSize(double s) {
		size=s;
		System.out.println("將大小設為"+size);
	}
}
