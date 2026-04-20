import java.util.Arrays;
import java.util.List;

public class Lambda01Exemplo {
    public static void main(String[] args) {
        
        List<Integer> listaDeNumeros = Arrays.asList(1,2,3,4,5);

        for (Integer elemento : listaDeNumeros){
            System.out.println(elemento);
        }
        
        
        System.out.println("--------------------------------------------");
        System.out.println("Usando o Lambda agora");

        listaDeNumeros.forEach((Integer numero) -> System.out.println(numero));
    }
}
