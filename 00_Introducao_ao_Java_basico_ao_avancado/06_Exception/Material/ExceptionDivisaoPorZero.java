
public class ExceptionDivisaoPorZero {
    public static void main(String[] args) {
        int totalNotas = 100;
        int quantidadeAlunos = 0;

        try {
            int media = totalNotas / quantidadeAlunos; // Divisão por zero

        } catch (ArithmeticException e) {
            System.out.println("Problema: Divisão por zero!");

        } finally {
            System.out.println("O Programa terminou.");
        }

        System.out.println("O programa segue normalmente...");
    }
}