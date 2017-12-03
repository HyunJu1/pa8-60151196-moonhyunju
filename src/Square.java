
public class Square extends Shape{

	double x, y, width;

	public Square(int x, int y, int width) { //»ý¼ºÀÚ
		this.x = x;
		this.y = y;
		this.width=width;

	}

	public double getArea() {
		double result = 0;
		//result = ((x + w) - x) * ((y + z) - y);
		result= width*width;
		return result;
	}

	public double getLength() {
		double result = 0;
		//result = (((x + w) - x) + ((y + z) - y)) * 2;
		result = 2*(width+width);
		return result;
	}

	public void draw() {
		System.out.println("Rectangle "+String.format("(%.1f,%.1f)-(%.1f,%.1f)",x,y,x+width,y+width));
	}
	public void move(double dx, double dy) {
	x+=dx;
	y+=dy;
	}



}
