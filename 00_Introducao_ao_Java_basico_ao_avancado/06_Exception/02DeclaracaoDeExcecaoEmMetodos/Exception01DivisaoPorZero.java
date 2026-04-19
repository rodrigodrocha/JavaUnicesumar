public class Exception01DivisaoPorZero {

    public static double calcularMedia(int totalNotas, int quantidadeDeAlunos) throws ArithmeticException{
        return (double) (totalNotas / quantidadeDeAlunos);
    }

    public static void main(String[] args) {
        int totalNotas = 10;
        int quantidadeDeAlunos = 1;

        try {
            double media = calcularMedia(totalNotas, quantidadeDeAlunos);

            System.out.println("Media das notas: " + media);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erro: Divisão por zero" );
        }
    }

}
