//60151196 ������
//shapeŬ������ ��ӹ޴�  circleŬ����. 
public class Circle extends Shape {

	double x, y, z;
	public static final double PI = 3.141592; //���

	public Circle(int x, int y, int z) { //������ 
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
	public void move(double dx, double dy) { //move �������̵��Ͽ� �����ؾ��Ѵ�. x��y��ǥ�� ���� dx�� dy��ŭ �̵� .
	x+=dx;
	y+=dy;
	
	}

}
