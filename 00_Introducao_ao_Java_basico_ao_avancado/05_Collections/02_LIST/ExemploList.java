import java.util.Arrays; //import explicita da classe arrays
import java.util.List;
import java.util.ArrayList;

//import java.util.*; //IMPORTA TODAS AS CLASSES DO PACOTE java.util

public class ExemploList{
	public static void main(String[] args){
		List<String> lista = new ArrayList<>();

		//ADICIONANDO ELEMENTOS
		lista.add("Java");
		lista.add("Python");
		lista.add("C++");
		

		//VERIFICANDO SE O LISTA CONTÉM UM ELEMENTO
		System.out.println("Contém 'Java'? " + lista.contains("Java")); //true

		//ADICIONANDO TODOS OS ELEMENTOS DE OUTRA COLEÇÃO
		List<String> outraLista = Arrays.asList("JavaScript", "Ruby");
		lista.addAll(outraLista);


		//IMPRIME --> ["java", Python, c++, javascript, ruby]
		System.out.println("lista completa: " + lista);

		//REMOVENDO um elemento
		lista.remove("Python");

		//IMPRIME --> 
		System.out.println("lista após remoção do Python: " + lista);

		//OBTENDO UM ELEMENTO PELA POSIÇÃO/ ÍNDICE
		String elemento = lista.get(2); // Obtém o terceiro elemento da lista
		System.out.println("Elemento no índice 2: " + elemento);
		

		//LIMPANDO O lista
		lista.clear();
		System.out.println("lista após limpar: " + lista);
		


	}
}