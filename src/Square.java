//60151196 ������
//shapeŬ������ ��ӹ޴�  SquareŬ����. 
public class Square extends Shape{

	double x, y, width;

	public Square(int x, int y, int width) { //������
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
	}    //string.format �̿� ����. .1f�� ����Ͽ� �Ҽ��� ù°�ڸ������� ����ϵ��� 
	public void move(double dx, double dy) { //move �������̵��Ͽ� �����ؾ��Ѵ�. x��y��ǥ�� ���� dx�� dy��ŭ �̵� .
	x+=dx;
	y+=dy;
	}



}
