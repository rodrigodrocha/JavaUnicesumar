import java.util.ArrayList;
import java.util.List;

public class EX01_ArrayList{
	public static void main(String[] args){

		List<Integer> numbers = new ArrayList<>();

		//Adiconando Valores a lista com o método .add()
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(7);
		
		//Interação em uma lista ou ArrayList
		for (Integer i: numbers){
			System.out.println(i);
		}

		//Acessando um valor da lista pelo índice e o método .get()
		System.out.println(numbers.get(0));
	}
}