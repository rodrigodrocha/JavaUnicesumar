public class Exception03IndiceDeArray {
    public static void main(String[] args){
        int[] numeros = {1, 2, 3};

        try {
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Erro: " + e.getMessage());
        }
        
       
    }
}
