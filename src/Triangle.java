//60151196 ������
//shapeŬ������ ��ӹ޴�  TriangleŬ����. 
public class Triangle extends Shape {

	double x, y, bottom, width;

	public Triangle(int x, int y, int bottom, int width) { //������ 
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
		result = (Math.hypot(bottom/2, width))*2+bottom;
		return result;
	}

	public void draw() {
		System.out.println("Triangle location" + "(" + x + ", " + y + ")" + "-bottom(" + (bottom) + ") " + "-width(" + (width) + ") ");
	}

	@Override
	public void move(double dx, double dy) {
	x+=dx;
	y+=dy;
	
		
	}

}
