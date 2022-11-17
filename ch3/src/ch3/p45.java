package ch3;

public class p45 {
	public static void main(String[] args) {
		System.out.println("宣告car451");
		Car45 car451;
		car451 = new Car45();
		car451.setCar45(1234,20.5);
		System.out.println("宣告car452");
		Car45 car452;
		
		System.out.println("將car451指定給car452");
		car452=car451;
		
		System.out.print("car451的");
		car451.show();
		System.out.print("car452的");
		car452.show();
		
		System.out.println("改變car451的相關資料");
		car451.setCar45(2345,30.5);
		
		System.out.print("car451的");
		car451.show();
		System.out.print("car452的");
		car452.show();
	}
}
class Car45{
	private int num;
	private double gas;
	
	public Car45() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public void setCar45(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
