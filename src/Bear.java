
public class Bear implements Drawable{
	private Drawable[] dd=new Drawable[3];
	public Bear(int x, int y, int rd){
		Shape sq=new Square(x-rd,y-rd,rd*2);		
		Shape c1=new Circle(x-rd,y-rd,rd/2);
		Shape c2=new Circle(x+rd,y-rd,rd/2);
		
		dd[0]=sq;
		dd[1]=c1;
		dd[2]=c2;
		
	}
	public void draw(){
		System.out.println("Bear");
		for(Drawable d:dd){
			d.draw();
		}	
	}
}
