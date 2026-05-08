public class Ex02_Main{
	public static void main(String[] args){
		Ex02_Class_Rectangle retangulo = new Ex02_Class_Rectangle(10.5, 2.3);

		System.out.println(retangulo.square());

		Ex02_Class_Rectangle quadrado = new Ex02_Class_Rectangle(5);

		System.out.println(quadrado.square());
	}
}