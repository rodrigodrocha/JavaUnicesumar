abstract class FiguraGeometrica{
	abstract double calcularArea(double b, double h);
	abstract double calcularPerimetro(double b, double h);
}

class Retangulo{
	double calcularArea(double b, double h){
		return b * h;
	}
	double calcularPerimetro(double b, double h){
		return 2 * b + 2 * h;
	}
}

public class AplicationEx01{
	public static void main(String[] args){

		Retangulo retangulo = new Retangulo();
		System.out.println("A área do retângulo é de " + retangulo.calcularArea(5, 6));
		System.out.println("O perímetro do retângulo é de " + retangulo.calcularPerimetro(5, 6));

	}
}