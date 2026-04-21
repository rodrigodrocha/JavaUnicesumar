@FunctionalInterface
interface Calculadora {
    double calcular(double a, double b);
}

public class exemplo02ComFuncional {
    public static void main(String[] args) {
        Calculadora soma = (a, b) -> a + b; //não precisa colocar double a, double b pois o java já atribui com base na interface
        System.out.println("Soma: " + soma.calcular(10, 5));
        Calculadora subtracao = (a, b) -> a - b;
        System.out.println("Subtrair: " + subtracao.calcular(10,5));
        Calculadora multiplicar = (a, b) -> a * b;
        System.out.println("Multiplicacao: " + multiplicar.calcular(10,5));
        Calculadora dividir = (a, b) -> a / b;
        System.out.println("dividir: " + dividir.calcular(10,5));
    }
}
