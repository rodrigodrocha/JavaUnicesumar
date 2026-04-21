@FunctionalInterface
interface OperacaoMatematica {
    double executar(double a, double b);
}

public class Ex01CalculadoraPersonalizada {
    public static void main(String[] args) {
        OperacaoMatematica potencia = (a, b) -> Math.pow(a, b);
        OperacaoMatematica raizDaSoma = (a, b) -> Math.sqrt(a + b);

        System.out.println("Potência: " + potencia.executar(2, 3));
        System.out.println("Raiz quadrada da soma: " + raizDaSoma.executar(10, 15));
    }
}
