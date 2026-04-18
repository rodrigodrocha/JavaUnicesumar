public class Exception01DivisaoPorZero{
    public static void main(String[] args){
        int totalNotas = 5;
        int quantidadeDeAlunos = 2;

        try {
            double media = (double)totalNotas / (double)quantidadeDeAlunos; //Divisão por zero    
            System.out.println(media);
        }catch (ArithmeticException e){
            System.out.println("Problema divisão por zero");
        }finally {
            System.out.println("O programa terminou.");
        }
    }
}