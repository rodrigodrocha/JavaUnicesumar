class CalculadoraTradicional{
    public double somar(double a, double b){
        return a + b;
    }
    public double subtrair(double a, double b){
        return a - b;
    }
    public double mutiplicar(double a, double b){
        return a * b;
    }
    public double divisao(double a, double b){
        return a / b;
    }
}

public class exemplo01SemFuncional {

    public static void main(String[] args) {
        CalculadoraTradicional calculadora = new CalculadoraTradicional();

        double resultadoSoma = calculadora.somar(10, 5);
        System.out.println("soma: " + resultadoSoma);
        double resultadoSubtracao = calculadora.subtrair(10, 5);
        System.out.println("subratracao: " + resultadoSubtracao);
        double resultadoMultiplicacao = calculadora.mutiplicar(10, 5);
        System.out.println("multiplicacao: " + resultadoMultiplicacao);
        double resultadoDivisao = calculadora.divisao(10, 5);
        System.out.println("Divisao: " + resultadoDivisao);
    }
}
