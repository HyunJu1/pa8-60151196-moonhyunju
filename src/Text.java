//60151196 문현주
//Drawable을 구현하는 Text클래스
public class Text implements Drawable{
	String word;
public Text(String s) {
	word=s;
}
public void draw() {
	System.out.println(word);
}
}
