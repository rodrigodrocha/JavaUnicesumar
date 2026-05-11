import java.util.ArrayList;
import java.util.List;

public class EX02_ListComOf{
	public static void main(String[] args){


		//outro jeito de criar lista com o método .of()
		// esse tipo de List é imutável ela não podemos alterar o tamnho dela
		// se ela tem o tamanho de 4 não podemos deixar com tamanho diferente
		// não podemos adicionar e nem remover nenhum item da lista e nem alterá-los
		var list = List.of("A", "B", "C", "D");
		
		
		//Interação em uma lista com list.of()
		for (String i: list){
			System.out.println(i);
		}

	}
}