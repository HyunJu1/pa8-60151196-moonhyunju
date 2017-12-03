//60151196 문현주
//shape클래스를 상속받는  circle클래스. 
public class Circle extends Shape {

	double x, y, z;
	public static final double PI = 3.141592; //상수

	public Circle(int x, int y, int z) { //생성자 
		this.x = x;
		this.y = y;
		this.z = z;

	}

	public double getArea() {
		double result = 0;
		result = z * z * PI;
		return result;
	}

	public double getLength() {
		double result = 0;
		result = z * 2 * PI;
		return result;
	}

	public void draw() {
		System.out.println("Circle center" + "(" + x + ", " + y + ")" + "-radius(" + (z) + ") ");
	}

	@Override
	public void move(double dx, double dy) { //move 오버라이드하여 구현해야한다. x와y좌표가 각각 dx와 dy만큼 이동 .
	x+=dx;
	y+=dy;
	
	}

}
