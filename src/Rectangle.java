//60151196 문현주
//shape클래스를 상속받는 rectangle클래스
public class Rectangle extends Shape {

	double x, y, w, z;

	public Rectangle(int x, int y, int w, int z) { //생성자
		this.x = x;
		this.y = y;
		this.w = w;
		this.z = z;

	}

	public double getArea() {
		double result = 0;
		//result = ((x + w) - x) * ((y + z) - y);
		result= w*z;
		return result;
	}

	public double getLength() {
		double result = 0;
		//result = (((x + w) - x) + ((y + z) - y)) * 2;
		result = (w+z)*2;
		return result;
	}

	public void draw() {
		System.out.println("Rectangle" + " " + "(" + x + ", " + y + ")" + "-(" + (x + w) + ", " + (y + z) + ")");
	}
	public void move(double dx, double dy) {
	  x+=dx;
	  y+=dy;
	  w+=dx;
	  z+=dy;
	}



}
