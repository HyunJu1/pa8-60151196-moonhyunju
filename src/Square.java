//60151196 문현주
//shape클래스를 상속받는  Square클래스. 
public class Square extends Shape{

	double x, y, width;

	public Square(int x, int y, int width) { //생성자
		this.x = x;
		this.y = y;
		this.width=width;

	}

	public double getArea() {
		double result = 0;
		result= width*width;
		return result;
	}

	public double getLength() {
		double result = 0;
		result = 2*(width+width);
		return result;
	}

	public void draw() {
		System.out.println("Rectangle "+String.format("(%.1f,%.1f)-(%.1f,%.1f)",x,y,x+width,y+width));
	}    //string.format 이용 가능. .1f를 사용하여 소수점 첫째자리까지만 출력하도록 
	public void move(double dx, double dy) { //move 오버라이드하여 구현해야한다. x와y좌표가 각각 dx와 dy만큼 이동 .
	x+=dx;
	y+=dy;
	}



}
