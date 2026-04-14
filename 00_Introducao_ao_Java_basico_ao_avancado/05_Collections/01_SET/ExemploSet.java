import java.util.Set;
import java.util.HashSet;

//import java.util.*; //IMPORTA TODAS AS CLASSES DO PACOTE java.util

public class ExemploSet{
	public static void main(String[] args){
		Set<String> conjunto = new HashSet<>();

		//ADICIONANDO ELEMENTOS
		conjunto.add("Java");
		conjunto.add("Python");
		conjunto.add("C++");
		

		//VERIFICANDO SE O CONJUNTO CONTÉM UM ELEMENTO
		System.out.println("Contém 'Java'?" + conjunto.contains("Java"));

		//ADICIONANDO MAIS ELEMENTOS
		conjunto.add("JavaScript");
		conjunto.add("Ruby");


		//IMPRIME -->
		System.out.println("Conjunto completo: " + conjunto);

		//REMOVENDO
		conjunto.remove("Python");

		//IMPRIME --> 
		System.out.println("Conjunto completo: " + conjunto);
		

		//TENTANDO COLOCAR ELEMENTO DUPLICADO
		boolean foiAdicionado = conjunto.add("Java");
		System.out.println("Java foi adicionado novamente? " + foiAdicionado);

		//LIMPANDO O CONJUNTO
		conjunto.clear();
		System.out.println("Conjunto após limpar: " + conjunto);
		


	}
}