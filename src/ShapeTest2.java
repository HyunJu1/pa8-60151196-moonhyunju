//60151196 문현주
//메인메소드 포함된 클래스
public class ShapeTest2 {

	public static void main(String[] args) {

		Shape[] shapes = new Shape[5];
		shapes[0] = new Rectangle(10, 20, 30, 40);
		shapes[1] = new Rectangle(30, 30, 10, 10);
		shapes[2] = new Circle(50, 20, 30);
		shapes[3] = new Square(10, 10, 20); // tesing Square
		shapes[4] = new Triangle(10, 10, 20, 30); // testing Triangle
		for (Shape s : shapes) {
			System.out.printf("Area: %.1f\n", s.getArea());
			System.out.printf("Length: %.1f\n", s.getLength());
		}
		Drawable[] drawables = new Drawable[7];
		for (int i = 0; i < shapes.length; i++) {
			drawables[i] = shapes[i];
		}
		drawables[5] = new Text("Sample Text");
		drawables[6] = new Bear(100, 100, 20);
		for (Drawable d : drawables) {
			d.draw();
		}
		Shape circle=new Circle(100,100,20);
		
		System.out.println("");
		System.out.println("****circle moving test****");
		for(int i=0; i<10; i++){
			circle.move(10,10);
			circle.draw();
		}

	}

}
