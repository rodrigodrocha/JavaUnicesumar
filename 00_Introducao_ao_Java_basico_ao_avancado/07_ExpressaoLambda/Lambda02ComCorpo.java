import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Lambda02ComCorpo {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        List<Integer> numerosPares = new ArrayList<>();
        System.out.println("Lambda com Corpo");
                               //se deixar so o nome da variável pode pois na lista ja mostra o tipo de variável que ela vai ser                     
        listaDeNumeros.forEach((numero) -> {
            
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            }
        });
        System.out.println(numerosPares);
    }
}
