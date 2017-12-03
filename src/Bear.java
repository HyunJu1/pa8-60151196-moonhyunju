//60151196 문현주
//Drawable 을 implement하여 구현 하는  Bear클래스. 
public class Bear implements Drawable{
	private Drawable[] dd=new Drawable[3];
	public Bear(int x, int y, int rd){ //constructor of Bear
		Shape sq=new Square(x-rd,y-rd,rd*2);		
		Shape c1=new Circle(x-rd,y-rd,rd/2);
		Shape c2=new Circle(x+rd,y-rd,rd/2);
		
		dd[0]=sq;
		dd[1]=c1;
		dd[2]=c2;
		
	}
	public void draw(){
		System.out.println("Bear"); //이 메소드가 호출되면 먼저, Bear출력 
		for(Drawable d:dd){
			d.draw();
		}	
	}
}
