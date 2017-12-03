//60151196 문현주
//shape클래스를 상속받는  Triangle클래스. 
public class Triangle extends Shape {

	double x, y, bottom, width;

	public Triangle(int x, int y, int bottom, int width) { //생성자 
		this.x = x;
		this.y = y;
		this.bottom = bottom;
		this.width=width;

	}

	public double getArea() {
		double result = 0;
		result = (bottom*width)/2;
		return result;
	}

	public double getLength() {
		double result = 0;
		result = (Math.hypot(bottom/2, width))*2+bottom; //Math라는 클래스의 메소드인 hypot이용하여 빗변의 길이를 구한다 .
		return result;
	}

	public void draw() {
		System.out.println("Triangle location" + "(" + x + ", " + y + ")" + "-bottom(" + (bottom) + ") " + "-width(" + (width) + ") ");
	}

	@Override
	public void move(double dx, double dy) {
	x+=dx;
	y+=dy;
	
	 //move 오버라이드하여 구현해야한다. x와y좌표가 각각 dx와 dy만큼 이동 .	
	}

}
