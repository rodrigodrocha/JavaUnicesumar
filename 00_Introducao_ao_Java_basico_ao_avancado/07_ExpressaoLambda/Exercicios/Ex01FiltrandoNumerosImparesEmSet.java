import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex01FiltrandoNumerosImparesEmSet {

    public static void main(String[] args){

        Set<Integer> numeros = new HashSet<>();
        for (int i = 0; i < 18; i++) {
            numeros.add(i);
        }

        numeros.removeIf( numero -> numero % 2 == 0); // removo todos os números pares

        System.out.print(numeros);
    }
}
