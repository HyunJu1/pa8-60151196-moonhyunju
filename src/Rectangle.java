//60151196 ������
//shapeŬ������ ��ӹ޴� rectangleŬ����
public class Rectangle extends Shape {

	double x, y, w, z;

	public Rectangle(int x, int y, int w, int z) { //������
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
	public void move(double dx, double dy) { //move �������̵��Ͽ� �����ؾ��Ѵ�. x��y��ǥ�� ���� dx�� dy��ŭ �̵� .
	  x+=dx;
	  y+=dy;
	  w+=dx;
	  z+=dy;
	}



}
