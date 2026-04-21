import java.util.ArrayList;
import java.util.List;

public class Ex02ManipulacaoDeListaComExpressoesLambda {

        public static void main(String[] args) {
            List<String> minhaLista = new ArrayList<>();
            minhaLista.add("maca");
            minhaLista.add("banana");
            minhaLista.add("uva");
            minhaLista.add("cereja");
            minhaLista.add("abacaxi");
            minhaLista.add("laranja");

            //removendo frutas com mais de 5 caracteres
            minhaLista.removeIf(s -> s.length() > 5);

            //adicionando novo elemento no início da lista
            minhaLista.add(0, "pera");

            //Imprimindo todos os itens da lista por interação
            minhaLista.forEach(System.out::println);
        }
}
