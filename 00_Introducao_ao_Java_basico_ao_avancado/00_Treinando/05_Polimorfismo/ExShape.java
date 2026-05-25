public class ExShape {

    public static void main(String[] args) {
        Calculater calculator = new Calculater();

        double circle = calculator.sumSurfaceArea(new Circle(5));
        double retangulo = calculator.sumSurfaceArea(new Rectangle(10, 5));
        double quadrado = calculator.sumSurfaceArea(new Square(7));

        System.out.print("Quadrado: ");
        System.out.println(quadrado);
        System.out.println(retangulo);
        System.out.println(retangulo);
        System.out.println(circle);
        System.out.println(circle);
        
    }
}
