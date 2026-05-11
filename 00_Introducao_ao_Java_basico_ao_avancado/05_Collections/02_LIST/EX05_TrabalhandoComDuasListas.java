import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class EX05_TrabalhandoComDuasListas{
	public static void main(String[] args){
		var list1 = new ArrayList<>(List.of("A", "B", "C"));
		var list2 = new ArrayList<>(List.of("C", "D", "E"));
		//PEGO TUDO DA LISTA "list2" e adiciono na 'list1'
		list1.addAll(list2);
		System.out.println(list1);
		list1.remove("C");
		list1.remove("D");
		list1.remove("E");

		// o método .retainAll() retorna apenas o item em comum entre as listas.
		list1.retainAll(list2);
		System.out.println(list1);
		list1.add("A");
		list1.add("B");
		list1.remove("C");
		list1.add("C");

		//o método removeAll() remove todos os itens iguais que tem nas duas lista e atribui a list1
		list1.removeAll(list2);
		System.out.println(list1);

	}
}